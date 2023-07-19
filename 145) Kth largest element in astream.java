import java.util.*;

import java.io.*;

public class Kthlargest {

    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

    Comparator comp = pq.comparator();

    int k = 0;

    Kthlargest(int k, int[] arr) {

        // Write your code here.

        for (int i = 0; i < arr.length; i++) {

            pq.add(arr[i]);

            if (pq.size() > k)

                pq.poll();

        }

    }

    void add(int num) {

        // Write your code here.

        pq.offer(num);

        if (pq.size() > k)

            pq.poll();

    }

    int getKthLargest() {

        // Write your code here.

        return pq.peek();

    }

}
