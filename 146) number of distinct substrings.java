import java.util.*;
import java.io.*;

class Node {
    Node[] links = new Node[26];
    boolean end;

    Node() {
        Arrays.fill(links, null);
        end = false;
    }
}

class Trie {
    Node root;

    Trie() {
        root = new Node();
    }
}

public class Solution {
    public static int distinctSubstring(String word) {
        // count the number of nodes in the trie.
        Trie trie = new Trie();
        int l = word.length();
        int count = 0;
        for (int i = 0; i < l; i++) {
            Node head = trie.root;
            for (int j = i; j < l; j++) {
                char ch = word.charAt(j);
                if (head.links[ch - 'a'] == null) {
                    head.links[ch - 'a'] = new Node();
                    head = head.links[ch - 'a'];
                    count++;
                } else {
                    head = head.links[ch - 'a'];
                }
            }
        }
        return count;
    }
}
