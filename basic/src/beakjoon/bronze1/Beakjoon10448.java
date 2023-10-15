package beakjoon.bronze1;

import java.io.*;

public class Beakjoon10448 {
    // 백준 10448. 유레카 이론
    // 완전 탐색 : 브루트포스 알고리즘

    static int [] triNum = new int[45];

    // 삼각수로 나올 수 있는 값들을 배열로 저장
    // 3<=n<=1000 조건이라 n*(n+1)/2 해도 n은 최대값이 44
    private static void formula(){
        for(int i=1; i<45; i++){
            triNum[i] = i*(i+1)/2;
        }
    }

    private static boolean eureka(int k) {
        for (int a = 1; a < 45; a++) {
            for (int b = 1; b < 45; b++) {
                for (int c = 1; c < 45; c++) {
                    if (triNum[a] + triNum[b] + triNum[c] == k) return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        formula(); // 배열 저장 완료

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            int k = Integer.parseInt(br.readLine());

            int result = eureka(k)? 1:0;
            // 결과를 BufferedWriter를 통해 출력
            bw.write(String.valueOf(result)); // 또는 Integer.toString 사용하는데 암거나 상관 없음
            bw.write("\n");
        }
        bw.close();
    }
}
