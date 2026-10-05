package ch06.solutions;

import java.util.*;

public class P4 {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] strArr = paragraph.replaceAll("[^a-zA-Z0-9]"," ").split(" +");

        Map<String, Integer> countMap  = new HashMap<>();
        for(String word : strArr){
            String w = word.toLowerCase();
            countMap.put(w,countMap.getOrDefault(w,0)+1);

        }

        List<String> keySet = new ArrayList<>(countMap.keySet());

        keySet.sort((o1, o2) -> {
            return -countMap.get(o1).compareTo(countMap.get(o2));
        });

        for(String key : keySet){
            if(Arrays.asList(banned).contains(key)) continue;

            return key;
        }

        return null;
    }
}
