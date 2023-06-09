import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> v) 
    {
        // Write your code here.
        int n = v.size(); //size of the array

        int cnt1 = 0, cnt2 = 0; // counts
        int el1 = Integer.MIN_VALUE; // element 1
        int el2 = Integer.MIN_VALUE; // element 2

        // applying the Extended Boyer Moore's Voting Algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && el2 != v.get(i)) {
                cnt1 = 1;
                el1 = v.get(i);
            } else if (cnt2 == 0 && el1 != v.get(i)) {
                cnt2 = 1;
                el2 = v.get(i);
            } else if (v.get(i) == el1) cnt1++;
            else if (v.get(i) == el2) cnt2++;
            else {
                cnt1--; cnt2--;
            }
        }

        ArrayList<Integer> ls = new ArrayList<>(); // list of answers

        // Manually check if the stored elements in
        // el1 and el2 are the majority elements:
        cnt1 = 0; cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (v.get(i) == el1) cnt1++;
            if (v.get(i) == el2) cnt2++;
        }

        int mini = (int)(n / 3) + 1;
        if (cnt1 >= mini) ls.add(el1);
        if (cnt2 >= mini) ls.add(el2);

        // Uncomment the following line
        // if it is told to sort the answer array:
        //Collections.sort(ls); //TC --> O(2*log2) ~ O(1);

        return ls;
    }
}