package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon3460 {
    // 백준 3460. 이진수
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            int x = n;
            int index= 0;
            while (x/2!=1){
                if(n%2==1) {
                    System.out.print(index + " ");
                }
                n = n/2;
                index ++;
            }
        }
    }
}
