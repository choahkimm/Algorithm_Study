package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 5356. Triangles
public class Beakjoon5356 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            char alpabet = st.nextToken().charAt(0); // 시작 문자열

            for (int j = 0; j < n; j++) {
                for (int k = 0; k <= j; k++) {
                    // 내부에선 숫자 값으로 저장되므로 'A'로부터 몇번째 알파벳인지 알 수 있음
                    // 26으로 나누는 이유 'Z'->'A'로 래핑
                    System.out.print((char) ((alpabet - 'A' + j) % 26 + 'A'));
                }
                System.out.println();
            }
            // Print a blank line between letter triangles
            if (i < t - 1) {
                System.out.println();
            }
        }
    }
}
