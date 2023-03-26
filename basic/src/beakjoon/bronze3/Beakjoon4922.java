package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon4922 {
    // 백준 4922. Walk Like an Egyptian
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;

            System.out.print(n +" => ");
            int sum = 0;
            for(int i=0; i<n; i++){
                sum += 2*i;
            }
            System.out.println(1+sum);
        }
    }
}
