package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon6764 {
    // 백준 6764. Sounds fishy!
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int pre = Integer.parseInt(br.readLine());

        boolean rising = true;
        boolean diving = true;
        boolean constant = true;

        for (int i = 0; i < 3; i++) {
            int value = Integer.parseInt(br.readLine());
            if (pre < value) {
                diving = false;
                constant = false;
            } else if (pre > value) {
                rising = false;
                constant = false;
            } else {
                rising = false;
                diving = false;
            }
            pre = value;
        }
        if (constant) {
            System.out.println("Fish At Constant Depth");
        } else if (rising) {
            System.out.println("Fish Rising");
        } else if (diving) {
            System.out.println("Fish Diving");
        } else {
            System.out.println("No Fish");
        }
        br.close();


    /**
     * 기존 풀이 (120s)
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        String answer;
        if(a>b && b>c && c>d) answer="Fish Diving";
        else if(a<b && b<c && c<d) answer="Fish Rising";
        else if(a==b && b==c && c==d) answer="Fish At Constant Depth";
        else answer="No Fish";
        System.out.println(answer);
     */
    }
}
