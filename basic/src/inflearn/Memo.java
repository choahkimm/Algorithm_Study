package inflearn;

import java.util.Scanner;

public class Memo {
    public static void main(String[] args) {
        // Scanner를 통해 문자열을 입력 받음
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        // 입력 받은 문자열을 char로 쪼개서 하나하나 검사
        String answer = "";
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) // 만약 대문자라면?
                answer += Character.toLowerCase(c); // 소문자로 변환
            else // 소문자라면?
                answer += Character.toUpperCase(c); // 대문자로 변환
        }
        System.out.println(answer);
    }
}
