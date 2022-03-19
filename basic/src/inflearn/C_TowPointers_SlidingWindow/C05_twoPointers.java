package inflearn.C_TowPointers_SlidingWindow;

import java.util.Scanner;

public class C05_twoPointers {
    //5. 연속된 자연수의 합 - two pointers 알고리즘으로 풀기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer=0, sum=0, lt=0;
        int m = n/2+1;
        // 나누기 2 이유 : 15라고 가정했을 때, n/2+1=8이다.
        // 7+8은 이미 15이고, 8+9는 15를 넘게되므로 가장 큰 값은 8이 된다.

        int[] arr = new int[m];
        for(int i=0; i<m; i++) arr[i]=i+1;

        // two pointers (lt, rt)
        for(int rt=0; rt<m; rt++){
            sum += arr[rt];
            if(sum==n) answer++;
            while (sum>=n){
                sum -= arr[lt++];
                if(sum==n)answer++;
            }
        }
        System.out.println(answer);
    }
}
