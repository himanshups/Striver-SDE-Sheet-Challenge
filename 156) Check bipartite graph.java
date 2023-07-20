import java.util.*;

public class Solution {

    static boolean bfs(int node,int m,ArrayList<ArrayList<Integer>> adj,int[] color){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        color[node]=0;
        while(!q.isEmpty()){
            Integer n=q.remove();
            for(Integer i:adj.get(n)){
                if(color[i]==-1){
                    color[i]=1-color[n];
                    q.add(i);
                }
                else if(color[i]==color[n]){
                     return false;
                }
               
            }
        }
        return true;
    }

    public static boolean isGraphBirpatite(ArrayList<ArrayList<Integer>> edges) {

        // Write your code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        int n=edges.size();
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(edges.get(i).get(j)==1 && i!=j)
                adj.get(i).add(j);
                adj.get(j).add(i);
            }
        }

        int[] color=new int[n];
        for(int i=0;i<n;i++) color[i]=-1;

        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(bfs(i,n,adj,color)==false)
                return false;
            }
        }
        return true;
    }

}