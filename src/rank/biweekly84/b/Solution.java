package rank.biweekly84.b;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long countBadPairs(int[] nums) {
        int n=nums.length;
        int[]a=new int[n];
        long ret=0L;
        Map<Integer,Integer> rec=new HashMap();
        for(int i=0;i<n;i++){
            a[i]=nums[i]-i;
            ret+=i;
            ret-=rec.getOrDefault(a[i],0);
            rec.put(a[i],rec.getOrDefault(a[i],0)+1);
        }
        return ret;
    }

}
