package rank.biweekly84.a;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> mergeSimilarItems(int[][] a, int[][] b) {
        int[] c = new int[1001];
        for (int[] d : a) {
            c[d[0]] += d[1];
        }
        for (int[] d : b) {
            c[d[0]] += d[1];
        }
        List<List<Integer>> ret = new ArrayList();
        for (int i = 1; i <= 1000; i++) {
            if (c[i] > 0) {
                List<Integer> list = new ArrayList();
                list.add(i);
                list.add(c[i]);
                ret.add(list);
            }
        }
        return ret;
    }

}
