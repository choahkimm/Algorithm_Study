package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon5073 {
    // 백준 5073. 삼각형과 세 변
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
           String input = br.readLine();
           if("0 0 0".equals(input)) break;

           StringTokenizer st = new StringTokenizer(input);
           int a = Integer.parseInt(st.nextToken());
           int b = Integer.parseInt(st.nextToken());
           int c = Integer.parseInt(st.nextToken());

           if(a==b && b==c && a==c) System.out.println("Equilateral");
           else if(a==b || b==c || a==c) System.out.println("Isosceles");
           else System.out.println("Scalene");
        }

    }
}
