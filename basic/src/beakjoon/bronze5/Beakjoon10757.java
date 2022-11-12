package beakjoon.bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class Beakjoon10757 {
    // 큰 수 A+B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        System.out.println(a.add(b));
    }
}
