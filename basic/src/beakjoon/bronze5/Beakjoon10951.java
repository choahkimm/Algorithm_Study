package beakjoon.bronze5;

import java.util.Scanner;

public class Beakjoon10951 {
//    백준 10951. A+B-4
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()){ // 뒤에 값이 더 없을 때까지
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+b);
     }
    sc.close();
    }
}
