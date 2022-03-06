package inflearn.C_TowPointers_SlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon2003 {
    // two pointer 알고리즘 연습 - 백준 2003번 수들의 합2
    // [문제]
    // N개의 수로 된 수열 A[1], A[2], …, A[N] 이 있다.
    // 이 수열의 i번째 수부터 j번째 수까지의 합 A[i] + A[i+1] + … + A[j-1] + A[j]가
    // M이 되는 경우의 수를 구하는 프로그램을 작성하시오.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n개로 된 수열
        int m = sc.nextInt(); // 합쳐 서 m이 되는
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        // two pointer
        int s=0, e=0, sum=0, cnt=0;// 포인터 s,e : 현재 배열의 시작과 끝
        // 10 5
        // s,e
        //  1  2  3  4  2  5  3  1  1  2

        // 먼저 e를 한 칸씩 움직여 s~e 사이에 있는 원소들의 구간합을 구한다.

        while(e<n){
            // while(true) 이고 else if(e==n) break; 조건이 있었는데 걍 이거랑 같은듯?
            if(sum >= m) sum -= arr[s++]; // sum 값이 m보다 크게될 경우
                // 아직 탐색할 구간이 남았으므로 s의 값을 이동해
                // 앞에 있는 원소들을 하나씩 빼준다. sum=m 이 된 경우 카운트++
           // else if(e==n) break; // 포인터 e가 배열의 끝(n)에 도착했을 때
                // sum < m 이면 더이상 탐색해봤자 sum보다 큰 값은 안나오니까 반복문 종료
            else sum += arr[e++];

            if(sum==m){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
