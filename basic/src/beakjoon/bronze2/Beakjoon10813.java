package beakjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon10813 {
    // 백준 10813. 공 바꾸기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int temp = 0;
        int[] basket = new int[n];

        // 바구니에 번호를 저장
        for (int i = 0; i < n; i++) {
            basket[i] = i + 1;
        }

        // m 번만큼 공을 교환한다
        for (int j = 0; j < m; j++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());

            temp = basket[a-1];
            basket[a-1] = basket[b-1];
            basket[b-1] = temp;
        }

        // 출력
        for(int i=0; i<basket.length; i++){
            System.out.print(basket[i] + " ");
        }
    }

}
