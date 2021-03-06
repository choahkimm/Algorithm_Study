package inflearn.C_TowPointers_SlidingWindow;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        // 4. 연속 부분 수열
        // 이중 for문을 돌리면 시간 복잡도가 클테니 two pointer로 해본다...

        /* 힌트
lt와 rt 두개의 포인터를 두고 둘 다 0으로 초기화 시켜준다.
그 다음에 rt가 증가하면서 sum 이라는 변수에 rt를 더해주고 sum이 m과 같은지를 확인한다.
만약 sum이 m보다 커지는 경우에는 lt를 증가시키면서 lt값만큼 sum에서 빼줘야 한다.
그래야 m과 sum이 같은지를 확인할 수 있다.
sum이 m보다 작아지는 순간까지 while문을 돌리고 lt를 증가시면서 sum에서 빼주면서
m과 같아지는 순간 카운팅을 한다.
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // two pointer
        int lt=0, rt=0;
        int sum=0, cnt=0;
        while(lt<n && rt<n){
            for(int i=lt; i<n; i++){
                sum+=arr[i];
            }
            if(sum==m){
                cnt++;
            }
        }
    }
}

/*
4. 연속 부분수열
설명

N개의 수로 이루어진 수열이 주어집니다.

이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.

만약 N=8, M=6이고 수열이 다음과 같다면

1 2 1 3 1 1 1 2

합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.


입력
첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.

수열의 원소값은 1,000을 넘지 않는 자연수이다.


출력
첫째 줄에 경우의 수를 출력한다.


예시 입력 1

8 6
1 2 1 3 1 1 1 2
예시 출력 1

3
 */

