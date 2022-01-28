package inflearn.A_String;

import java.util.Scanner;

public class String10 {
    //10. 가장 짧은 문자거리

    public static String solution(String str, char t){
        String answer = "";
        // t[e]ach[e]rmod[e]    e
        //   1     5      10

        // t가 가리키는 문자열이 인덱스 몇번에 있는지..
        // s의 인덱스 번호와 비교해서 최소값 도출

        for(int i=0; i < str.length(); i++){ // i=2 'a' 라는 문자
            if( str.charAt(i) == t){ // 타겟문자라면 0으로 셋팅
                answer += "0";
            }else {
               int right = i - str.indexOf(t,i);
               int left = i -str.lastIndexOf(t,i);

               int distance = Math.min(right, left) ;
               System.out.println("i="+ i + " "+ left+" " +right +" => "+distance );
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  // teachermode
        char t = sc.next().charAt(0); // e
        System.out.println(solution(str, t));
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