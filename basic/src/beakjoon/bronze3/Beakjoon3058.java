package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon3058 {
    // 백준 3058. 짝수를 찾아라
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum=0;
            int min=101; //입력될 값이 100 미만이니까

            for(int j=0; j<7; j++){
                int input = Integer.parseInt(st.nextToken());
                if(input%2==0){
                    sum+=input;
                    if(input<min){
                        min=input;
                    }
                }
            }
            System.out.println(sum+ " " + min);
        }
    }
}
