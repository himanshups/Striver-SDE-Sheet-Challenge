
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static int[] findMedian(int[] arr, int n) {

        // To store the incoming stream elements
        ArrayList<Integer> store = new ArrayList<Integer>();

        // To store the medians
        int[] medians = new int[n];

        for (int i = 0; i < n; i++) {

            // Storing the incoming data from stream in a vector 'store'
            store.add(arr[i]);

            // Sorting the vector to arrange all the elements in sorted order
            Collections.sort(store);

            int median;
            // Even number of elements are read, (Note - 0 based indexing is used)
            if ((i + 1) % 2 == 0) {

                // Average of middle two values
                median = (store.get(i / 2) + store.get((i + 1) / 2)) / 2;

            }
            // odd number of elements are read
            else {

                // The middle value of the sorted arrangement of the elements read so far
                median = store.get(i / 2);

            }

            medians[i] = (median);

        }

        return medians;
    }
}
