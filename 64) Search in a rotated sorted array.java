public class Solution {
    public static int search(int arr[], int key) {
        // Write your code here.
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            // if mid points to the target
            if (arr[mid] == key)
                return mid;

            // if left part is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <=key && key <= arr[mid] ){
                    // element exists
                    high = mid - 1;
                } else {
                    // element does not exist
                    low = mid + 1;
                }
            } else { // if right part is sorted
                if (arr[mid] <= key && key <= arr[high]) {
                    // element exists
                    low = mid + 1;
                } else {
                    // element does not exist
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}