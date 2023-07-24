import java.util.*;
import java.io.*;

public class Trie {
    static TrieNode root;

    public Trie() {
        root = new TrieNode('\0');
    }

    public static void insert(String word, TrieNode node) {
        if (word.length() == 0) {
            node.isT++;
            ;
            return;
        }

        int index = word.charAt(0) - 'a';
        TrieNode child = node.children[index];
        if (child == null) {
            child = new TrieNode(word.charAt(0));
            child.count++;
            node.children[index] = child;
        } else {
            child.count++;
        }
        insert(word.substring(1), child);
    }

    public static void insert(String word) {
        insert(word, root);
    }

    public int countWordsEqualTo(String word, TrieNode node) {
        if (word.length() == 0) {
            if (node.isT > 0) {
                return node.isT;
            }
        }
        if (word.length() == 0) {
            return 0;
        }
        int index = word.charAt(0) - 'a';
        TrieNode child = node.children[index];
        if (child == null) {
            return 0;
        }
        return countWordsEqualTo(word.substring(1), child);

    }

    public int countWordsEqualTo(String word) {
        return countWordsEqualTo(word, root);
    }

    public int countWordsStartingWith(String word, TrieNode node) {
        if (word.length() == 0) {
            return node.count;
        }
        int index = word.charAt(0) - 'a';
        TrieNode child = node.children[index];
        if (child == null) {
            return 0;
        }
        return countWordsStartingWith(word.substring(1), child);
    }

    public int countWordsStartingWith(String word) {
        return countWordsStartingWith(word, root);
    }

    public void erase(String word, TrieNode node) {
        if (word.length() == 0) {
            node.isT--;
            return;
        }

        int index = word.charAt(0) - 'a';
        TrieNode child = node.children[index];
        child.count--;
        erase(word.substring(1), child);
    }

    public void erase(String word) {
        erase(word, root);
    }
}

class TrieNode {
    TrieNode[] children;
    int isT;
    char data;
    int count;

    TrieNode(char data) {
        this.data = data;
        this.children = new TrieNode[26];
        count = 0;
        isT = 0;
    }
}