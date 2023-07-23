import java.util.*;

import java.io.*;

 

public class Solution {

 

public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {

 

// Write your code here

HashMap<Integer, Integer> map = new HashMap<>();

ArrayList<Integer> count = new ArrayList<>();

 

for (int i = 0; i < k; i++) {

map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);

}

count.add(map.size());

 

int p = 0;

for (int i = k; i < arr.size(); i++) {

map.put(arr.get(p), map.getOrDefault(arr.get(p), 0) - 1);

// to avoid zero time repeated element

if (map.get(arr.get(p)) == 0) {

map.remove(arr.get(p));

}

p++;

map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);

count.add(map.size());

}

return count;

}

}