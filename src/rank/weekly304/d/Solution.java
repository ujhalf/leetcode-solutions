package rank.weekly304.d;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {-1, 4, -1, 2, 0, 4};

        Solution solution = new Solution();
        System.out.println(solution.longestCycle(arr));
    }

    int[] seen;
    int ans = -1;

    public int longestCycle(int[] edges) {
        int n = edges.length;
        seen = new int[n];
        Arrays.fill(seen, -1);
        for (int i = 0; i < n; i++) {
            if (seen[i] == -1) {
                build(edges, i);
            }
        }
        return ans;
    }

    private void build(int[] edges, int node1) {
        seen[node1] = 0;
        Map<Integer, Integer> rec = new HashMap<>();
        rec.put(node1, 0);
        int nxt = edges[node1];
        int dis = 0;
        while (nxt != -1 && seen[nxt] == -1) {
            seen[nxt] = 0;
            rec.put(nxt, ++dis);
            nxt = edges[nxt];
        }
        if (rec.containsKey(nxt)) {
            ans = Math.max(ans, dis - rec.get(nxt) + 1);
        }
    }

}
