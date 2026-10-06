package ch06.solutions;

import java.util.*;

public class P6 {
    public String longestPalindrome(String s) {
        // start, end 포인터?
        int start = 0;
        int end = s.length()-1;
        int n = s.length();

        // edgecase
        if(start == end) return s;

        // bfs
        Queue<int[]> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][n];
        int[] np = new int[] {start, end};
        q.offer(np);
        visited[np[0]][np[1]] = true;

        while(!q.isEmpty()){

            int[] p = q.poll();
            int head = p[0], tail = p[1];
            if(head > tail) break;

            // 회분 쳌
            boolean isPalindrome = true;
            while(head < tail){
                // 다르다면 걍 바로 아님
                if(s.charAt(head) != s.charAt(tail)){
                    isPalindrome=false;
                    break;
                }
                //같다면, 포인터 이동.
                head++;
                tail--;
            }
            if(isPalindrome) return s.substring(p[0],p[1]+1); //회문 찾으면 조기종료
            else{
                int[] npL = new int[] {p[0]+1,p[1]} ;
                int[] npR = new int[] {p[0],p[1]-1} ;
                if(!visited[npL[0]][npL[1]]) {q.offer(npL); visited[npL[0]][npL[1]]=true;}
                if(!visited[npR[0]][npR[1]]) {q.offer(npR); visited[npR[0]][npR[1]]=true;}

            }
        }


        return null;
    }
}