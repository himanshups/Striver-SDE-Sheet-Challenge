
public class Solution {

 

    public static int lcs(String s, String t) {

        //Your code goes here

        int m=s.length();

        int n=t.length();

        int a[][] = new int[m+1][n+1];

        

        for(int i=1;i<=m;i++){

            for(int j=1;j<=n;j++){

                if(s.charAt(i-1)==t.charAt(j-1)){

                    a[i][j] = a[i-1][j-1]+1;

                }

                else{

                    a[i][j] = Math.max(a[i-1][j],a[i][j-1]);

                }

            }

        }

        return a[m][n];

    }

 

}