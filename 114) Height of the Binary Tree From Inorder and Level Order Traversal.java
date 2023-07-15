import java.util.*;

public class Solution {

    public static int heightOfTheTree(int[] inorder, int[] levelOrder, int N) {
        int ans = 0;
        Queue<Node> queue = new LinkedList<>();

        Node root = new Node(0, 0, N - 1);
        queue.add(root);

        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < N; i++) {
            mp.put(inorder[i], i);
        }

        for (int i = 0; i < N; i++) {
            Node temp = queue.poll();

            ans = Math.max(ans, temp.h);

            int li = temp.li, ri = temp.ri;
            int rootIndexOfSubTree = mp.get(levelOrder[i]);

            if (rootIndexOfSubTree - 1 >= li) {
                Node lst = new Node(temp.h + 1, li, rootIndexOfSubTree - 1);
                queue.add(lst);
            }

            if (rootIndexOfSubTree + 1 <= ri) {
                Node rst = new Node(temp.h + 1, rootIndexOfSubTree + 1, ri);
                queue.add(rst);
            }
        }

        return ans;
    }

    static class Node {
        int h;
        int li;
        int ri;

        Node(int h, int li, int ri) {
            this.h = h;
            this.li = li;
            this.ri = ri;
        }
    }
}