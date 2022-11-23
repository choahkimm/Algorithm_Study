package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon5596 {
    // 백준 5596. 시헝 점수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        StringTokenizer st1 = new StringTokenizer(a);
        StringTokenizer st2 = new StringTokenizer(b);


        int sum1=0, sum2=0;
        for(int i=0; i<4; i++){
            sum1 += Integer.parseInt(st1.nextToken());
            sum2 += Integer.parseInt(st2.nextToken());
        }

        if(sum1 < sum2) System.out.println(sum2);
        else System.out.println(sum1);

    }
}
