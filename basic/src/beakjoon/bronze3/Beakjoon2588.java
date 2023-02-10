package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2588 {
    // 백준 2588. 곱셈
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int ans3 = (b%10)*a;  // b의 일의 자리 수 * a
        int ans4 = ((b%100)/10)*a; // b의 십의 자리 수 * a
        int ans5 = (b/100)*a;  // b의 백의 자리 수 * a

        System.out.println(ans3);
        System.out.println(ans4);
        System.out.println(ans5);
        System.out.println(a*b); // (6)은 곱셈의 결과
    }
}
