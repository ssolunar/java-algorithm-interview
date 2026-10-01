package ch06.solutions;

import java.util.Arrays;

public class P3 {
    public String[] reorderLogFiles(String[] logs) {

        Arrays.sort(logs, (a,b) -> {
            boolean A = Character.isDigit(a.charAt(a.length()-1));
            boolean B = Character.isDigit(b.charAt(b.length()-1));
            // a와 b 모두 digit 일때,
            if(A && B) return 0;
            // a digit, b letter
            else if( A ) return 1;
            else if( B ) return -1;
            // a와 b 모두 letter 일때,
            else{
                String[] arrA = a.split(" ",2);
                String[] arrB = b.split(" ",2);
                if (arrA[1].compareTo(arrB[1]) == 0){
                    return arrA[0].compareTo(arrB[0]);
                }
                return arrA[1].compareTo(arrB[1]);
            }
        });

        return logs;
    }

}
