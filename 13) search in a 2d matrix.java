import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        boolean flag = false;
        for(int i =0;i<mat.size();i++){
            for(int j = 0;j<mat.get(0).size();j++){
                if(mat.get(i).get(j)==target) flag=true;
            }
        }
        return flag;
    }
}
