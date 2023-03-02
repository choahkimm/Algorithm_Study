package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon4435 {
    // 백준 4435. 중간계 전쟁
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int rate[][] = { { 1, 2, 3, 3, 4, 10 }, { 1, 2, 2, 2, 3, 5, 10 } };

        for(int i=0; i<t; i++){
            int armys [] = new int[2];

            for(int j=0; j<2; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int k=0;
                while (st.hasMoreTokens()){
                    armys[j] += Integer.parseInt(st.nextToken()) * rate[j][k++];
                }
            }
            String message = "";
            if(armys[0] > armys[1]) message="Good triumphs over Evil";
            else if(armys[0] < armys[1]) message="Evil eradicates all trace of Good";
            else message = "No victor on this battle field";

            System.out.println("Battle " + (i+1) + ": " +message);
        }
    }
}
