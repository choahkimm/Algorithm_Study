package beakjoon.bronze5;

import java.util.Scanner;

public class Beakjoon10871 {
    // 백준 10871. X보다 작은 수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int a = 0;
        for(int i=0; i<n; i++){
            a = sc.nextInt();
            if(a < x){
                System.out.print(a + " ");
            }
        }
    }
}
