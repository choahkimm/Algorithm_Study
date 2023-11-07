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
            long target = a[k]; // 서로 더해서 나와야 하는 값
            int i = 0, j = n - 1; // 투 포인터

            while (i < j) {
                // 투 포인터 이동 규칙에 따라
                int sum = a[i] + a[j]; // sum은 반복문 안에서 값이 계속 바뀌어야 함

                // sum이랑 target이랑 같을 경우 한번 더 체크 해준다.
                // 그래야 자기 자신과 더해서 좋은 수를 찾지 않을 수 있기 때문
                if ( sum == target) { // 좋은 수?
                    // 투 포인터가 k가 아닐 때 결괏값에 반영 및 while문 종료
                    if (i != k && j != k) {
                        goodNum++;
                        break;
                    }
                    // 두 숫자의 합으로 나타내야 하므로, 현재 숫자를 가리킨다면 포인터를 이동시킨다.
                    // 정렬된 데이터에서 자기 자신을 포함하면 안 됨!
                    else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                }else if (sum < target) {
                        i++;
                } else if (sum > target) {
                        j--;
                }
            }
        }
            System.out.println(goodNum);
    }
}

// 참고 : https://life-study-1031.tistory.com/22