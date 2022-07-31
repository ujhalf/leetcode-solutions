package rank.weekly304.d;

public class Solution2 {

    public static void main(String[] args) {
        int[] arr = {-1, 4, -1, 2, 0, 4};

        Solution2 solution = new Solution2();
        System.out.println(solution.longestCycle(arr));
    }

    public int longestCycle(int[] edges) {
        int n = edges.length;
        int ans = -1;
        int[] time = new int[n];
        for (int i = 0, clock = 1; i < n; i++) {
            if (time[i] == 0) {
                for (int x = i, start_time = clock; x >= 0; x = edges[x]) {
                    if (time[x] > 0) {
                        if (time[x] >= start_time) {
                            ans = Math.max(ans, clock - time[x]);
                        }
                        break;
                    }
                    time[x] = clock++;
                }
            }
        }
        return ans;
    }

}
