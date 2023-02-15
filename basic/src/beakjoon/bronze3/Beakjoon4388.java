package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon4388 {
    // 백준 4388. 받아올림
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] input = br.readLine().split(" ");
            int number1 = Integer.parseInt(input[0]);
            int number2 = Integer.parseInt(input[1]);

            if (number1 == 0 && number2 == 0) {
                break;
            }

            char[] digits1 = String.valueOf(number1).toCharArray();
            char[] digits2 = String.valueOf(number2).toCharArray();

            int maxLength = Math.max(digits1.length, digits2.length);
            int carryCount = 0;
            int carry = 0;
            for (int i = 0; i < maxLength; i++) {
                int digit1 = i < digits1.length ? digits1[digits1.length - i - 1] - '0' : 0;
                int digit2 = i < digits2.length ? digits2[digits2.length - i - 1] - '0' : 0;
                int sum = digit1 + digit2 + carry;
                if (sum >= 10) {
                    carryCount++;
                    carry = 1;
                } else {
                    carry = 0;
                }
            }

            System.out.println(carryCount);
        }
    }
}
