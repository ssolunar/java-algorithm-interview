package ch06.solutions;

import java.util.*;

public class P4_r1 {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] strArr = paragraph.replaceAll("\\W", " ").toLowerCase().split(" +");

        Map<String, Integer> map = new HashMap<>();
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        for(String str : strArr){

            if(!bannedSet.contains(str)) map.put(str, map.getOrDefault(str, 0)+1);
        }

        String[] keys = map.keySet().toArray(new String[0]);
        Arrays.sort(keys, (a,b)->{
            return -(map.get(a) - map.get(b));
        });

        return keys[0];
    }
}
