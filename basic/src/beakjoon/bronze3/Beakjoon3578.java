package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon3578 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int holeNum = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();


        if(holeNum==0) sb.append(1); // case 1 : 구멍 개수 0
        else if(holeNum==1) sb.append(0); // case 2 : 구멍 개수 1
        else {
            // case 3-1) 홀수인 경우: 맨 앞엔 0이 못 오니까 4를 붙여야함
            if(holeNum%2==1){
                sb.append(4);
            }
            // case 3-2) 짝수인 경우

            for(int i=0; i<holeNum/2; i++){
                sb.append(8);
            }
        }
        System.out.println(sb);
    }
}
