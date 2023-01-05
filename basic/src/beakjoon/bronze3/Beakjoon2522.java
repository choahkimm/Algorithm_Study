package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2522 {
    // 백준 2522. 별 찍기 -12
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            for(int j=n-1; j>i; j--){
                System.out.print(" ");
            }
            for(int k=0; k<i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<n-1; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<n-1-i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
