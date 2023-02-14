package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon4740 {
    // 백준 4740. 거울, 오! 거울
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // way1. for문 이용
        while (true){
            String s = br.readLine();
            if("***".equals(s)) break;

            String reverse = "";
            for(int i=s.length()-1; i>=0; i--){
                reverse = reverse + s.charAt(i);
            }
            System.out.println(reverse);
        }

        // way2. StringBuffer 클래스의 reverse() 메소드 이용
        while (true) {
            String s = br.readLine();
            if ("***".equals(s)) break;

            StringBuffer sb = new StringBuffer(s); // 문자열 그대로 받기
            System.out.println(sb.reverse()); // reverse() 메소드
        }

    }
}
