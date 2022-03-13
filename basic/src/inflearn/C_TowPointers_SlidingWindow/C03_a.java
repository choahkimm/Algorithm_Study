package inflearn.C_TowPointers_SlidingWindow;

import java.util.Scanner;

public class C03_a {
    public static void main(String[] args) {
        // 3. 최대 매출
        // sliding window 개념을 활용하여 문제 풀기
        // [k의 크기를 가진] 창문을 만들고 이동

        C03_a T = new C03_a();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,k,arr));
    }

    public int solution(int n, int k, int[] arr){
        int answer, sum=0;

        // 1. 윈도우 만들기
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        answer=sum;

        // 2. 슬라이딩
        for(int i=k; i<n; i++){
            sum += (arr[i]-arr[i-k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }
}
