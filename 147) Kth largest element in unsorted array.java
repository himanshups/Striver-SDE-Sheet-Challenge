import java.util.* ;
import java.io.*; 
public class Solution {

static int kthLargest(ArrayList<Integer> list, int size, int K) {

       Random random = new Random();
       int left = 0;
       int right = list.size() - 1;
       while (true) {
           int pivotIndex = random.nextInt(right - left + 1) + left;
           pivotIndex = partition(list, left, right, pivotIndex);
           if (pivotIndex == K - 1) {
               return list.get(pivotIndex);
           } else if (pivotIndex > K - 1) {
               right = pivotIndex - 1;
           } else {
               left = pivotIndex + 1;
           }
       }
   }

   private static int partition(ArrayList<Integer> list, int left, int right, int pivotIndex) {
       int pivotValue = list.get(pivotIndex);
       int storeIndex = left;
       Collections.swap(list, pivotIndex, right);
       for (int i = left; i < right; i++) {
           if (list.get(i) > pivotValue) {
               Collections.swap(list, i, storeIndex);
               storeIndex++;
           }
       }
       Collections.swap(list, storeIndex, right);
       return storeIndex;
}
}
