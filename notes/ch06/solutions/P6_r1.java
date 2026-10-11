package ch06.solutions;

import java.util.*;

public class P6_r1 {
    public String longestPalindrome(String s) {
        // 예외처리
        if(s.length() == 1){
            return s;
        }
        // 출력 정의
        String word= Character.toString(s.charAt(0));

        for(int i = 0 ; i<s.length() ; i++ ){
            // 포인터 정의
            int l2 = i, l3 =i;
            int r2 = i+1;
            int r3 = i+2;

            while(l2>=0 && r2 < s.length()){
                // 같지 않으면 break
                if(s.charAt(l2) != s.charAt(r2)) break;
                // 같으면, 글자 더 길면 반영
                if(r2-l2+1 > word.length()) {
                    word = s.substring(l2,r2+1);

                }
                l2--;
                r2++;
            }
            while(l3>=0 && r3 < s.length()){
                // 같지 않으면 break
                if(s.charAt(l3) != s.charAt(r3)) break;
                // 같으면, 글자 더 길면 반영
                if(r3-l3+1 > word.length()) {
                    word = s.substring(l3,r3+1);

                }
                l3--;
                r3++;
            }

        }
        return word;
    }
}
