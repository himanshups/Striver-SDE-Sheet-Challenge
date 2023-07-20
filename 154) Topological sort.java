import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int vtx, int edg) 
    {
        // Write your code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<vtx; i++) {
           adj.add(new ArrayList<>()); 
        }

        int indegree[] = new int[vtx];
        for(int i=0; i<edges.size(); i++) {
            int u = edges.get(i).get(0);
            int v = edges.get(i).get(1);
            adj.get(u).add(v);
            indegree[v]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<vtx; i++) {
            if(indegree[i] == 0) q.add(i);
        }

        ArrayList<Integer> out = new ArrayList<Integer>();
        int count = 0;
        while(!q.isEmpty()) {
            int u = q.poll();
            out.add(u);

            for(int t=0; t<adj.get(u).size(); t++) {
                int v = adj.get(u).get(t);
                indegree[v]--;
                if(indegree[v] == 0) q.add(v);
            }
        }

        return out;
    }
}