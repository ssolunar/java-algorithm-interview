package ch06.solutions;

public class P1 {
    public boolean isPalindrome(String s) {
        // 1. input string 전처리
        // ex) "A man, a plan, a canal: Panama" -> "amanaplanacanalpanama"
        // 알파벳만 가져와야함.
        // 소문자로 바꿔야함.
        if(s.equals(" ")) return true;
        String s1 = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        // 회문검사
        int len = s1.length();
        for(int i = 0 ; i < len/2 ; i++){
            if(s1.charAt(i) == s1.charAt(len-i-1)){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

}
