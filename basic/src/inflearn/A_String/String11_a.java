package inflearn.A_String;

import java.util.Scanner;

public class String11_a {
    public static String solution(String s){
        String answer="";
        s=s+" "; // indexOutOf 어쩌구 에러 방지용
        int cnt=1;
        for(int i=0; i<s.length()-1; i++){ // 빈 문자 전까지만 i가 가야하니까
            if(s.charAt(i)==s.charAt(i+1)) {
                cnt++; // 같으면 cnt 증가
            }
            else{
                answer+=s.charAt(i);
                if(cnt>1) { // 1 이상 cnt를 answer에 쌓아주는 작업
                    answer+=String.valueOf(cnt);
                }
                cnt=1; //초기화
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(solution(str));
    }
    /*
    주의사항
i+1를 검사하기 때문에 마지막 문자를 검사할 때 에러가 발생합니다.

그러니 마지막 문자 검사를 위해 처음 문자열에 " " 빈 문자를 더해줍니다.

그러고 반복문에서 length() 까지가 아닌 length()-1까지만 반복합니다.

     */
}
