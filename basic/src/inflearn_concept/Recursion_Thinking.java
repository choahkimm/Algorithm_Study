package inflearn_concept;

import java.util.Scanner;

public class Recursion_Thinking {
    // 수학 함수 뿐만 아니라 다른 많은 문제들을 Recursion으로 해결할 수 있다.
    // --> 반복문 대신 Recursion 사용

    public static void main(String[] args) {
        System.out.println(length("ace"));
        printChars("ace");
        System.out.println();
        printCharReverse("happy");
        System.out.println();

    }

    // 1. 문자열의 길이 계산
    public static int length(String str){
        if(str.equals(""))
            return 0;
        else
            return 1 + length(str.substring(1));
    }

    // 2. 문자열의 프린트
    public static void printChars(String str){
        if(str.length()==0)
            return;
        else {
            System.out.println(str.charAt(0));
            printChars(str.substring(1));
        }
    }

    // 3. 문자열을 뒤집어서 프린트
    public static void printCharReverse(String str){
        if(str.length()==0)
            return;
        else{
            printCharReverse(str.substring(1));
            System.out.println(str.charAt(0));

            //happy
            // appy
            //  ppy
            //   py
            //    y
        }
    }

    // 4. 2진수로 변환하여 출력
    public void printBinary(int n){
        if(n<2)
            System.out.println(n);
        else {
            // n을 2로 나눈 몫을 먼저 2진수로 변환하여 인쇄한 후
            printBinary(n/2);
            // n을 2로 나눈 나머지를 인쇄한다.
            System.out.println(n%2);
        }
    }

    // 5. 배열의 합 구하기
    public static int sum(int n, int [] data){
        if(n<=0)
            return 0;
        else
            return sum(n-1,data) + data[n-1];
    }

    // 6. 데이터 파일로부터 n개의 정수 읽어오기 (recursion으로는 거의 안 쓰는 case)
    public void readForm(int n, int [] data, Scanner in){
        if(n==0)
            return;
        else {
            readForm(n-1, data, in);
            data[n-1] = in.nextInt();
        }
    }

    // Recursion VS Interaction
    /*

    - 모든 순환함수는 반복문 (iteration)으로 변경 가능
    - 그 역도 성립함. 즉 모든 반복문은 recursion으로 표현 가능함
    - 순환 함수는 복잡한 알고리즘을 단순하고 알기쉽게 표현하는 것을 가능하게 함
    - 하지만 함수 호출에 따른 오버해드가 있음 (매개변수 전달, 엑티베이션 프레임 생성 등)

     */
}
