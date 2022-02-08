package inflearn.B_Array;

import java.util.Scanner;

public class Array05_a {

    // 05. 소수(에라토스테네스 체) -> 2, 3, 5...의 배수들 체로 걸러내기
    // 대표적인 소수 판별 알고리즘

    public static int solution(int n ){
        int answer=0;
        int[] ch= new int[n+1]; //5

        for(int i=2; i<n; i++){
            if(ch[i]==0){
                answer++;
                for(int j=i; j<=n; j=j+i){ // i의 배수들 체크, 배수에 수를 넣어버림
                    // 2의 배수, 3의 배수.. 이런 애들은 0이 아니므로 answer 증가 X
                    ch[j]=i;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

}
