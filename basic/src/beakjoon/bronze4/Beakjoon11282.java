package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon11282 {
    // 백준 11282. 한글
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) ;
        // '가' 의 아스키 코드 : 44032
        n += 44031;
        System.out.println((char)n);
    }
}
