package beakjoon.bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon11382 {
    // 백준 11382. 꼬마 정민
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = sc.nextBigInteger();
        System.out.println(a.add(b).add(c));
    }
}
