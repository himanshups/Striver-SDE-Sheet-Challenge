import java.util.* ;
import java.io.*; 
public class Solution {
    static int bellmonFord(int N, int m, int src, int dest, ArrayList<ArrayList<Integer>> edges) {
      // Write your code here.
      int dist[] = new int[N+1];
      int high = 1000000000;

      Arrays.fill(dist, high);

      dist[src] = 0;

      for(int i=1; i<=N; i++) {
        for(int j=0; j<m; j++) {
          int u = edges.get(j).get(0);
          int v = edges.get(j).get(1);
          int w = edges.get(j).get(2);

          if(dist[u] != high && dist[v] > dist[u] + w) {
            dist[v] = dist[u] + w;
          }
        }
      }

      boolean isCycle = false;

      for(int j=0; j<m; j++) {
        int u = edges.get(j).get(0);
        int v = edges.get(j).get(1);
        int w = edges.get(j).get(2);

        if(dist[u] != high && dist[v] > dist[u] + w) {
          isCycle = true;
          break;
        }
      }
      

      if(isCycle) {
        return -1;
      }

      return dist[dest];
    }    
}