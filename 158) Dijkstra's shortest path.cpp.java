#include <bits/stdc++.h>

using namespace std;

 

 

void create(vector<vector<int>> &vec,vector<vector<pair<int,int>>>& l ){

for(int i=0;i<vec.size();i++){

l[vec[i][0]].push_back({vec[i][1],vec[i][2]});

l[vec[i][1]].push_back({vec[i][0],vec[i][2]});

}

return;

}

 

 

vector<int> dijkstra(vector<vector<int>> &vec, int vertices, int edges, int source) {

vector<vector<pair<int,int>>> l(vertices,vector<pair<int,int>>());

create(vec,l);

set<pair<int,int>> q;

vector<int> ans(vertices,INT_MAX);

ans[source] = 0;

q.insert({0,source});

while(!q.empty()){

pair<int,int> temp=*q.begin();

q.erase(q.begin());

for(auto i: l[temp.second]){

if(ans[i.first]>temp.first+i.second){

ans[i.first]=temp.first+i.second;

q.insert({ans[i.first],i.first});

}

}

}

return ans;

}