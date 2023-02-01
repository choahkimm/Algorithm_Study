package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Beakjoon4458 {
    // 백준 4458. 첫 글자를 대문자로
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String s = br.readLine();
            String [] sArr = s.split("");
            sArr[0] = sArr[0].toUpperCase(Locale.ROOT);
            for(int j=0; j<sArr.length; j++){
                System.out.print(sArr[j]);
            }
            System.out.println();
        }
    }
}
