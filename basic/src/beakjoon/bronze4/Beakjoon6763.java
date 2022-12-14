package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon6763 {
    // 백준 6763. Speed fines are not fine!
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(br.readLine());
        int speed = Integer.parseInt(br.readLine());
        int difference = speed-limit;
        if(difference<= 0)
            System.out.println("Congratulations, you are within the speed limit!");
        else if(difference<=20)
            System.out.println("You are speeding and your fine is $100.");
        else if(difference<=30)
            System.out.println("You are speeding and your fine is $270.");
        else
            System.out.println("You are speeding and your fine is $500.");
    }
}
