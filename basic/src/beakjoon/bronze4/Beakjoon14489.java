package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon14489 {
    // 백준 14489. 치킨 두 마리
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int account1 = Integer.parseInt(st.nextToken());
        int account2 = Integer.parseInt(st.nextToken());
        int chicken = Integer.parseInt(br.readLine());

        int allAccounts = account1+account2;
        System.out.println((allAccounts >= chicken*2)? allAccounts-chicken*2 : allAccounts);
    }
}
