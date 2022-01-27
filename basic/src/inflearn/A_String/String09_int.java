package inflearn.A_String;

import java.util.Scanner;

public class String09_int {
    //9. 숫자만 추출

    // 아스키 코드 이용
    // 숫자    0 ~ 9
    // 아스키 48 ~ 57

    // 공식: answer = answer * 10 + ( x - 48)
    //  x값으로 차례대로 넘어오는 문자형숫자('0'~'9')를 합쳐서 10진수화 하는 방법
    public static int solution(String str){
        int answer=0;
        for(char x: str.toCharArray()){
            // 방법 1
            if(x>=48 && x<=57){
               answer = answer * 10 + (x-48);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
/*
9. 숫자만 추출
설명

문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.

만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.

추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.


입력
첫 줄에 숫자가 썩인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.


출력
첫 줄에 자연수를 출력합니다.
 */
