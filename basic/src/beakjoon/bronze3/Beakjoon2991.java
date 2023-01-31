package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2991 {
    // 백준 2991. 사나운 개
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1번 개
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 2번 개
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());


        st = new StringTokenizer(br.readLine());

        for(int i=0; i<3; i++) {
            int cnt = 0; // cnt 초기화
            int man = Integer.parseInt(st.nextToken());
            int dog1 = man % (a+b);
            int dog2 = man % (c+d);

            if(dog1<=a && dog1!=0) cnt++;
            if(dog2<=c && dog2!=0) cnt++;
            System.out.println(cnt);
        }

    }
}
