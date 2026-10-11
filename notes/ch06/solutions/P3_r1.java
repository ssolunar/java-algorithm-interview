package ch06.solutions;

import java.util.*;

public class P3_r1 {
    public String[] reorderLogFiles(String[] logs) {

        Arrays.sort(logs, (a,b) -> {

            boolean aIsDigit = Character.isDigit(a.split(" ")[1].charAt(0));
            boolean bIsDigit = Character.isDigit(b.split(" ")[1].charAt(0));

            // if both letter-logs
            if( !aIsDigit && !bIsDigit ){
                // same
                if(a.split(" ",2)[1].equals(b.split(" ",2)[1])){
                    return a.split(" ")[0].compareTo(b.split(" ")[0]);
                }
                else{
                    return a.split(" ",2)[1].compareTo(b.split(" ", 2)[1]);
                }
            }
            // if one letter one digit
            else if( !aIsDigit || !bIsDigit ){
                return (aIsDigit) ? 1 : -1 ;
            }
            // if both digit-logs
            else return 0;
        });

        return logs;
    }
}
