package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon17863 {
    // 백준 17863. FYI
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String t = br.readLine();
        System.out.println(t.substring(0,3).equals("555")? "YES":"NO");
        br.close();
    }
}
