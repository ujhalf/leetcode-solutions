package daily.p8.p6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> stringMatching(String[] words) {
        Map<String,Integer> map=new HashMap<>();

        for (String word : words) {
            map.put(word,map.getOrDefault(word,0)+1);
        }
        List<String>list=new ArrayList<>();
        for (String word : words) {
            boolean flag=false;
            for (String key : map.keySet()) {
                if (flag) {
                    break;
                }
                if (key.equals(word)) {
                    if (map.get(key) > 1) {
                        list.add(word);
                        flag=true;
                    }
                }else{
                    if (key.contains(word)) {
                        list.add(word);
                        flag=true;
                    }
                }
            }
        }
        return list;
    }
}
