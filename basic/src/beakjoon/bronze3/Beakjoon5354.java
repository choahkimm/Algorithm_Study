package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon5354 {
    // 백준 5354. J박스
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            // 박스 크기
            int n = Integer.parseInt(br.readLine());

            // 박스 크기만큼 for문
            for(int j=0; j<n; j++){ // 행
                for(int k=0; k<n; k++){ // 열
                    // 행, 열이 0이거나 n-1
                    if(j==0 || j==n-1 || k==0 || k==n-1) System.out.print("#");
                    else System.out.print("J");
                }
                System.out.println();
            }
            System.out.println();

        }
    }
}
