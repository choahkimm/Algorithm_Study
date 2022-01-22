package inflearn.A_String;

import java.util.Scanner;

public class String02 {
    public static String solution(String str){
        String answer="";

        for(char x : str.toCharArray()){ // toCharArray : 문자 배열 생성
            if(x==Character.toUpperCase(x)){
                // 대문자인가? 를 찾는 방법은 이렇게 무식하게가 아니라.. isUpperCase라는 메서드가 있다.
                answer += Character.toLowerCase(x);
            } else {
                answer += Character.toUpperCase(x);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("문자열을 입력하세요");

        String str = scan.nextLine();
        System.out.println(solution(str));
    }
}
/**
 * 2. 대소문자 변환
 * 설명
 *
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
 *
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * 출력
 * 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
 *
 *
 * 예시 입력 1
 *
 * StuDY
 * 예시 출력 1
 *
 * sTUdy
 */
