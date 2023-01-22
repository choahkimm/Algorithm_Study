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
            int min = 101; // 입력될 수가 100 이하니까
            int sum = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()){

                int n = Integer.parseInt(st.nextToken());
                if(n%2==0){
                    sum+=n;
                    if(n<min) {
                        min = n;
                    }
                }
            }
                System.out.println(sum+" "+min);
        }
    }
}
