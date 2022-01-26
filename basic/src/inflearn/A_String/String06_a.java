package inflearn.A_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class String06_a {
    // 6. 중복문자제거 -- index of 사용

    public static String solution(String str){
        String answer = "";
        for(int i=0; i<str.length(); i++){
            // charAt() : 문자가 처음 등장하는 index 번호
            //System.out.println( str.charAt(i) + " " + str.indexOf(str.charAt(i)));
            // 그렇다면, 자신의 위치와 처음 발견된 인덱스 번호가 같으면 남기고, 나머지는 버리기
            if(str.indexOf(str.charAt(i))==i){
                answer += str.charAt(i);
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
6. 중복문자제거
설명

소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.

중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.


입력
첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.


출력
첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 */