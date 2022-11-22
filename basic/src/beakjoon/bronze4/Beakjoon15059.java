package beakjoon.bronze4;

import java.util.Scanner;

public class Beakjoon15059 {
    // 백준 15059. Hard choice
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[3];

        for(int i=0; i<3; i++){
            arr[i]=sc.nextInt();
        }

        int sum = 0;

        for(int i=0; i<3; i++){
            int d = sc.nextInt();
            if(arr[i]<d) sum += d-arr[i];
        }
        System.out.println(sum);




    }
}
