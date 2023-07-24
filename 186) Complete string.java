import java.util.*;
import java.io.*;

public class Solution {
  static class Node {

    Node[] children = new Node[26];

    boolean eow;

    public Node() {
      for (int i = 0; i < 26; i++) {
        children[i] = null;
      }
    }
  }

  public static Node root = new Node();

  public static void insert(String word) {
    int level = 0;
    int len = word.length();
    int idx = 0;
    Node curr = root;
    for (; level < len; level++) {
      idx = word.charAt(level) - 'a';
      if (curr.children[idx] == null) {
        curr.children[idx] = new Node();
      }
      curr = curr.children[idx];
    }
    curr.eow = true;
  }

  public static boolean allPrefixCheck(String str) {

    StringBuilder temp = new StringBuilder("");

    for (int i = 0; i < str.length(); i++) {

      temp.append(str.charAt(i));

      if (search(temp) == false) {

        return false;

      }

    }

    return true;

  }

  public static String allPrefix(String[] arr) {

    String ret = "";

    for (int i = 0; i < arr.length; i++) {

      if (allPrefixCheck(arr[i].substring(0, arr[i].length() - 1))) {

        if (ret.length() == arr[i].length()) {

          if (ret.compareTo(arr[i]) > 0) {

            ret = arr[i];

          }

        } else {

          if (arr[i].length() > ret.length()) {

            ret = arr[i];

          }

        }

      }

    }

    if (ret.equals("")) {

      return "None";

    }

    return ret;

  }

  public static boolean search(StringBuilder key) {

    int level = 0;

    int len = key.length();

    int idx = 0;

    Node curr = root;

    for (; level < len; level++) {

      idx = key.charAt(level) - 'a';

      if (curr.children[idx] == null) {

        return false;

      }

      curr = curr.children[idx];

    }

    return curr.eow == true;

  }

  public static String completeString(int n, String[] a) {

    root = new Node();

    for (String word : a) {

      insert(word);

    }

    return allPrefix(a);

  }

}