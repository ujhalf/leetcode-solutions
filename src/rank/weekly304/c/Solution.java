
package rank.weekly304.c;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {4, 3, 0, 5, 3, -1};
        int a = 4, b = 0;
        Solution solution = new Solution();
        System.out.println(solution.closestMeetingNode(arr, a, b));
    }

    int INF = (int) 1e8;

    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int[] a = build(edges, node1);
        int[] b = build(edges, node2);
        int val = (int) 1e6;
        int ret = -1;
        for (int i = 0; i < edges.length; i++) {
            if (Math.max(a[i], b[i]) < val) {
                val = Math.max(a[i], b[i]);
                ret = i;
            }
        }
        return ret;
    }

    private int[] build(int[] edges, int node1) {
        int n = edges.length;
        int[] a = new int[n];
        Arrays.fill(a, INF);
        a[node1] = 0;
        int dis = 0;
        int nxt = edges[node1];
        while (nxt != -1 && a[nxt] == INF) {
            a[nxt] = ++dis;
            nxt = edges[nxt];
        }
        return a;
    }
}
