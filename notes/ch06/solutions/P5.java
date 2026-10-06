package ch06.solutions;

import java.util.*;

public class P5 {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map을 생각하자. Map<String:sortedWord, List<String>>
        // 한개씩 뽑아가면서 sort 후 그게 key에 있는지 체크
        // 없으면 새로운 <sotredWord,group> 등록

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            // sortedWord 만들자.
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            // map key에 sortedWord가 있는지?
            if(map.containsKey(sortedWord)){
                //있으면 해당 키 밸류인 list에 원래 word를 add 하자.
                map.get(sortedWord).add(str);
            }
            else{
                //없으면 새로운 list를 만들어서 sortedWord를 키로, list를 value로 만들어 넣기
                List<String> group = new ArrayList<>();
                group.add(str);
                map.put(sortedWord,group);
            }
        }
        // map은 완성
        List<List<String>> answer = new ArrayList<>();
        for(String key : map.keySet()){
            answer.add(new ArrayList<>(map.get(key)));
        }

        return answer;
    }
}
