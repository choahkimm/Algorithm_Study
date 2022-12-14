package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10768 {
    // 백준 10768. 특별한 날
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());

        if(month<2 || (month==2 && day<18)) System.out.println("Before");
        else if(month==2 && day==18) System.out.println("Special");
        else System.out.println("After");

    }
}
