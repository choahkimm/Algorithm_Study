package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon16600 {
    // 백준 16600. Contemporary Art
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double n = Double.parseDouble(br.readLine());

        System.out.printf(String.format("%.8f", Math.sqrt(n)*4.0));
    }
}
