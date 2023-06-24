public class Solution {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int s=1,e=m;
        while(s<=e){
            int mid=(s+e)/2;
            int temp = (int)Math.pow(mid, n);
            if(temp == m)
                return mid;
            else if(temp > m)
                e = mid-1;
            else
                s = mid+1;
        }
        return -1;
    }
}

