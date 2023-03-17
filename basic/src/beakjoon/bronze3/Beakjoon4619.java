package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon4619 {
    // 백준 4619. 루트
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            if(b==0 && n==0) break;
            int answer = 0;
            int distance = 0;
            for(int i=1; i<=b; i++){
                if(b <= Math.pow(i,n)){
                    answer = i;
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}
