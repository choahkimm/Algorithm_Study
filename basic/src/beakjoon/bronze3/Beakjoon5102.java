package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon5102 {
    // 백준 5102. Sarah's Toys
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a==0 && b==0) break;

            int remindToys = a-b;
            if(remindToys<2) System.out.println("0 0");
            else {
                if(remindToys%2==0) {  // 짝수
                    System.out.println(remindToys/2 + " "+ "0");
                }else { // 홀수
                    System.out.println((remindToys - 3)/ 2 + " " + "1");
                }
            }
        }
    }
}
