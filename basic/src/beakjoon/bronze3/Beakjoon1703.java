package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon1703 {
    // 백준 1703. 생장점
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int b = 1; // 가지의 수. 초기에는 1

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // 나무의 나이
            if(a==0) break;

            for(int i=0; i<a; i++){
               b *= Integer.parseInt(st.nextToken()); // 각 생장마다 자란 가지의 수
               b -= Integer.parseInt(st.nextToken()); // 잘라낸 가지들
            }
            System.out.println(b);
            // 초기화
            b=1;
        }
    }
}
