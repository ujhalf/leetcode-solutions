package rank.biweekly84.c;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public long taskSchedulerII(int[] t, int s) {
        Map<Integer,Long> rec=new HashMap();
        long today=1;
        for(int i=0;i<t.length;i++){
            int type=t[i];
            long prev=rec.getOrDefault(type,-1L*s);
            if(today-prev<=s){
                today=prev+s+1;
            }
            rec.put(type,today);
            today++;
        }
        return today-1;
    }

}
