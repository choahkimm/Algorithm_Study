package beakjoon.bronze5;

import java.util.Scanner;

public class Beakjoon18108 {
    // 백준 18108. 1998년생인 내가 태국에서는 2541년생?!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int by = sc.nextInt();

        int gap = 2541 -1998 ;

        System.out.println(by -gap);
    }
}
