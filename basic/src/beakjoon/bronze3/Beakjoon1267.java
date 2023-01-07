package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon1267 {
    // 백준 1267. 핸드폰 요금
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int Yfee = 0; // 30초마다 10원
        int Mfee = 0; // 60초마다 15원

        for(int i=0; i<n; i++){
            int call = Integer.parseInt(st.nextToken());
            Yfee += (call/30+1)*10 ;
            Mfee += (call/60+1)*15 ;
        }

        if(Mfee==Yfee) System.out.println("Y M " + Yfee );
        else if(Mfee < Yfee) System.out.println("M "+ Mfee);
        else System.out.println("Y "+ Yfee);
    }
}
