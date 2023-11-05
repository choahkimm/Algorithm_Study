package beakjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon1253 {
    // 백준 1253. 좋다
    // 자료구조, 정렬, 이분 탐색, 투 포인터
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // n의 개수
        int n = Integer.parseInt(br.readLine());
        int goodNum = 0;

        // 수 데이터 저장, 정렬
        int a[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);

        // 배열에서 투 포인터로 탐색 - i,j 양쪽 끝에 위치
        /*
            투 포인터 이동 원칙
            A[i]+A[j] > K; j--;
            A[i]+A[j] < K; i++;
            A[i]+A[j] = K; i++;k--; count++; //프로세스 종료
        */

        for (int k = 0; k < n; k++) {
            long find = a[k];
            int i = 0, j = n - 1; // 투 포인터

            while (i < j) {
                // 투 포인터 이동 규칙에 따라

                if (a[i] + a[j] == find) { // 좋은 수?
                    // 투 포인터가 k가 아닐 때 결괏값에 반영 및 while문 종료
                    if (i != k && j != k) {
                        goodNum++;
                        break;
                    }
                    // 투 포인터가 k가 맞을 때 포인터 변경 및 계속 수행
                    else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                }else if (a[i] + a[j] < find) {
                        i++;
                } else if (a[i] + a[j] > find) {
                        j--;
                }
            }
        }
            System.out.println(goodNum);
    }
}
