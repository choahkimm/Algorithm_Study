package inflearn.A_String;

import java.util.Scanner;

public class String10_a {
    //10. 가장 짧은 문자거리
    // 각 문자의 좌측에 있는 가까운 문자 t로부터의 거리,
    // 우측에 있는 가까운 문자 t로부터의 거리를 구한다.
    // 둘 중 작은 값이 최소 거리

    public static String solution(String str){
        String answer = "";

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}


/*
10. 가장 짧은 문자거리
설명

한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.

문자열의 길이는 100을 넘지 않는다.


출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.


예시 입력 1

teachermode e
예시 출력 1

1 0 1 2 1 0 1 2 2 1 0
 */