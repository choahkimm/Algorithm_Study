package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10990 {
    // 백준 10990. 별 찍기 15
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            for(int j=t-1; j>i; j--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=0; k<2*i-1; k++){
                System.out.print(" ");
            }
            // 첫째줄에는 별이 하나만 있으므로
            System.out.print(i>0? "*":"");
            System.out.println();
        }
    }
}
