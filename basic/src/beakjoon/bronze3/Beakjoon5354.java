package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon5354 {
    // 백준 5354. J박스
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for(int i=0; i<testCase; i++){
            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            for(int j=0; j<n; j++){
                sb.append("#");
            }
            System.out.println(sb);

            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            for(int j=0; j<n-2; j++){
                sb2.append("J");
            }
            sb2.append("#");


            for(int j=0; j<n-2; j++){
                System.out.println(sb2);
            }
            System.out.println(sb);

            System.out.println();
        }
    }
}
