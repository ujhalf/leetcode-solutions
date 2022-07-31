package daily.p7.p31;


import common.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public int maxLevelSum(TreeNode root) {
        int val = -(int) (2e9);
        int id = -1;
        int level = 1;
        Queue<TreeNode> q = new ArrayDeque();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            int sum = 0;
            while (size > 0) {
                TreeNode node = q.poll();
                sum += node.val;
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
                size--;
            }
            if (sum > val) {
                val = sum;
                id = level;
            }
            level++;
        }
        return id;
    }
}
