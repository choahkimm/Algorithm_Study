package beakjoon.bronze5;

import java.io.IOException;

public class Beakjoon11654 {
    // 백준 11654. 아스키 코드
    public static void main(String[] args) throws IOException {

        // 비효율적 코드
//        Scanner sc = new Scanner(System.in);
//        //[charAt()] String 에서 char 로, 즉 문자열을 잘라 문자로 변환한다.
//        int ch = sc.next().charAt(0);
//        // int 타입 변수에 저장함으로써 문자에 대응되는 값, 즉 아스키 코드값을 저장한다.
//        System.out.println(ch);

        // 애초에 System.in 은 byte 값으로 문자 한 개만 읽으면서 해당 문자에 대응되는 아스키코드 값을 저장할 수 있다.
        // 굳이 Scanner 를 안 써도 된다.
        // 주의 - 예외 처리
        int ch = System.in.read();
        System.out.println(ch);
    }
}
