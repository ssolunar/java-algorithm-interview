package ch06.solutions;

public class P3_v1 {
    /*
    * 0. 로그의 첫 단어는 식별자, 소문자로 구성되 문자로그, 숫자로만 구성된 숫자로그
    * 1. 문자로그는 모든 숫자로그 보다 앞에 온다.
    * 2. 문자로그는 내용의 사전순으로 정렬, 내용이 같다면 식별자의 사전순 정렬
    * 3. 숫자로그는 상대 순서를 유지함.*/
    public String[] reorderLogFiles(String[] logs) {
        // 정렬 문제...
        // 사전 순이니까 알파벳 -> char로 다루면 ASCII 즉 문자를 숫자로 계산 가능
        // 한개씩 꺼내면서 버블 정렬?

        // 결과를 담을 array
        String[] result = new String[logs.length];

        // pointer
        int p = 0;

        for(String log : logs){
            // intialilze
            if(p==0){
                result[p++] = log;
                continue;
            }

            // log가 letter 인지 digit 인지
            if(Character.isDigit(log.split(" ")[1].charAt(0))){
                // digit
                result[p++] = log;
                continue;
            }
            else{
                // letter
                for(int i = 0 ; i<p ; i++){
                    // i 로그가 digit이라면,
                    if(Character.isDigit(result[i].split(" ")[1].charAt(0))){
                        String tmp = result[i];
                        result[i] = log;
                        result[p++] = tmp;
                        break;
                    }
                    else{
                        // i 번째 로그가 letter
                        // 비교
                        // 식별자 제거
                        String indvI = result[i].split(" ")[0];
                        String indvL = log.split(" ")[0];

                        String sI = result[i].replace(indvI+" ","");
                        String sL = log.replace(indvL+" ","");

                        // 0 : 완전히 동일
                        // 1 : i가 더 앞
                        // 2 : log가 더 앞
                        int isBig = 0 ;

                        // 한글자씩 비교
                        for(int j = 0; j<sI.length() ; j++){
                            if(sI.charAt(j) == sL.charAt(j)) continue;
                            else if (sI.charAt(j) - sL.charAt(j) > 0 ) {
                                isBig = 2;
                                break;
                            }
                            else{
                                isBig = 1;
                                break;
                            }
                        }

                        switch (isBig) {
                            case 0:
                                //뒤로 미루로 log i 뒤로
                                int k = p ;
                                while(k<i+1){
                                    result[k] = result[--k];
                                }
                                result[i+1] = log;
                                break;
                            case 1:
                                // i + 1 과 비교해야됨
                                continue;
                            case 2:
                                // 뒤로 미루로 log가 i 앞으로
                                int m = p;
                                while(m<i){
                                    result[m] = result[--m];
                                }
                                result[i] = log;
                                break;

                        }


                    }
                }
            }
        }
        return result;
    }

}
