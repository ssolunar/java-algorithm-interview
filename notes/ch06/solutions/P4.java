package ch06.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P4 {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] strArr = paragraph.split(" ");

        Map<String, Integer> countMap  = new HashMap<>();
        for(String word : strArr){
            String w = word.replaceAll("!|?|'|,|;|.","");
            countMap.put(w,countMap.getOrDefault(w,0)+1);

        }

        List<String> keySet = new ArrayList<>(countMap.keySet());

        keySet.sort((o1, o2) -> {
           return countMap.get(o1).compareTo(countMap.get(o2));
        });



    }

}
