package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon5361 {
    // 백준 5361. 전투 드로이드 가격
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        double [] price = {350.34, 230.90, 190.55, 125.30, 180.90};
        for(int i=0; i<t; i++) {
            double sum =0;

            StringTokenizer st =new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                sum += Double.parseDouble(st.nextToken())*price[j];
            }
            System.out.println(String.format("$"+"%.2f",sum));
        }
    }
}
