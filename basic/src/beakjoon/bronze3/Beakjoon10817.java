package beakjoon.bronze3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Beakjoon10817 {
    // 백준 10817. 세 수
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int [] arry = new int[3];

        for(int i=0; i<3; i++){
            arry[i] = sc.nextInt();
        }

        Arrays.sort(arry);

        System.out.println(arry[1]);
    }
}
