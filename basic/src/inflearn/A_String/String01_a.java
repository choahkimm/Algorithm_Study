package inflearn.A_String;

import java.util.*;

// 백준 방식이되, solution은 프로그래머스 방식..
public class String01_a {
    public static int solution(String str, char t){
        int answer=0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        //System.out.println(str + " / " + t);

        // way 1
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i)==t)
//                answer++;
//        }
        // way 2 : 향상된 for문
        for(char x : str.toCharArray()){ // toCharArray : 문자 배열 생성
            if(x==t)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(solution(str,c));
    }
}

/**
 * 1. 문자 찾기
 * 설명
 *
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 *
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 *
 *
 * 입력
 * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
 *
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 첫 줄에 해당 문자의 개수를 출력한다.


 예시 입력 1

 Computercooler
 c
 예시 출력 1

 2
 */