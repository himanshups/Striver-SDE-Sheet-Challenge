import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.

        int arr[] = new int[n+m];

        int i = 0;

        int j=0;

        int k =0;

        while(i<m && j<n){

           

            if(arr1[i]<= arr2[j]){

                arr[k] = arr1[i];

                i++;

                k++;

            }

            else{

                arr[k] = arr2[j];

                j++;

                k++;

            }

            

        }

        while(i<m){

            arr[k] = arr1[i];

            i++;

            k++;

        }

        while(j<n){

            arr[k] = arr2[j];

            j++;

            k++;

        }

        return arr;

    }
}
