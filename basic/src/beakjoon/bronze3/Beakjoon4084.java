package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon4084 {
    // 백준 4084. Viva la Diferencia
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());


            if(!(a==0 && b==0 && c==0 && d==0)) {
                int cnt = 0;
                while (!(a==b && b==c && c==d && a==c && a==d && b==d)) {
                    int tempA = Math.abs(a-b);
                    int tempB = Math.abs(b-c);
                    int tempC = Math.abs(c-d);
                    int tempD = Math.abs(d-a);
                    a = tempA;
                    b = tempB;
                    c = tempC;
                    d = tempD;
                    cnt++;
                }
                System.out.println(cnt);
            }else break;
        }
    }
}
