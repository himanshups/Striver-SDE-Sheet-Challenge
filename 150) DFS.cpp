void dfs(int node, vector<int> adjList[], vector<int> &visited, vector<int> &res){
    visited[node] = 1;
    res.push_back(node);

    for(int adj: adjList[node]){
        if(!visited[adj]){
            dfs(adj, adjList, visited, res);
        }
    }
}

vector<vector<int>> depthFirstSearch(int V, int E, vector<vector<int>> &edges)
{
    vector<int>adjList[V];
    for(auto edge: edges){
        adjList[edge[0]].push_back(edge[1]);
        adjList[edge[1]].push_back(edge[0]);
    }

    vector<int> visited(V, 0);
    vector<vector<int>> result;
    for(int i = 0; i < V; i++){
        if(!visited[i]){
            vector<int> res;
            dfs(i, adjList, visited, res);
            result.push_back(res);       
        }
    }

   return result;
}