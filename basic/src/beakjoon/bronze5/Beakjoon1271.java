package beakjoon.bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class Beakjoon1271 {
    // 백준 1271. 엄청난 부자2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); // 가진 돈
//        int m = sc.nextInt(); // 생명체의 수

        // 문제는 입력값의 범위가 10의 1000제곱까지 될 수 있다는 것..
        // 이렇게 그냥 한다면 계산 범위를 벗어날 수도 있음
        // -- 파이썬은 큰 수를 자동으로 처리할 수 있지만 자바는 아님 (int의 메모리 범위는 '-2,147,483,648~2,147,483,647'이다.)

//        System.out.println(n/m);
//        System.out.println(n%m);

        // 무한의 정수가 들어갈 가능성이 있다면
        // 숫자의 범위가 무한인 Biginteger 사용 - 문자열 형태로 이루어져 사칙연산이 안 됨

        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();
        sc.close();
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));

        // Biginterger의 내부 함수를 이용해야 함
        /*
               더하기 : add()
               빼기 : subtract()
               곱하기 : multiply()
               나누기 : divide()
               나머지 : reminder()
         */
    }
}
