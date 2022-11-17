package beakjoon.bronze5;

import java.util.Scanner;

public class Beakjoon15727 {
    // 백준 15727. 조별과제를 하려는데 조장이 사라졌다
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        System.out.println((l%5==0)? l/5 : l/5+1);
    }
}
