package beakjoon.gold;

import java.io.IOException;
import java.util.Scanner;

public class Beakjoon10986 {
    // 백준 10986. 나머지 합
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int problem = sc.nextInt();
        int remain = sc.nextInt();
        long [] S = new long[problem];
        long [] C = new long[remain]; // ex: M=4면 가능한 나머지는 0,1,2,3,4 니까
        long answer =0;

        S[0] = sc.nextInt();
        for (int i = 1; i <problem ; i++) {
            S[i]=S[i-1]+sc.nextInt();
        }

        for (int i = 0; i < problem; i++) {
            int remainder = (int)(S[i]%remain);
            if(remainder==0)answer++;
            C[remainder]++;
        }
        for (int i = 0; i < remain; i++) {
            if(C[i]>1)
            {
                answer = answer + C[i]*(C[i]-1)/2;
            }
        }
        System.out.println(answer);
    }


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//        long[] S = new long[N]; // 합 배열
//        long[] C = new long[M]; // 같은 나머지의 인덱스를 카운트 하는 배열
//        long ans = 0;
//
//        st = new StringTokenizer(br.readLine());
//        S[0]=Integer.parseInt(st.nextToken());
//
//        for(int i=1; i<N; i++){
//            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
//        }
//
//        for(int i=0; i<N; i++){ // 합 배열 모든 값에 % 연산 수행
//            int reminder = (int)(S[i]%M);
//            if(reminder==0) ans++;
//            C[reminder]++;
//        }
//
//        for(int i=0; i<M; i++){
//            if(C[i] >1){
//                // 나머지가 같은 인덱스 중 2개를 뽑는 경우의 수를 더하기
//                ans = ans + (C[i]*(C[i]-1)/2);
//            }
//        }
//        System.out.println(ans);
//    }
}


    /*
    문제 풀이 step

     1. 문제 분석 - 구간합 배열로 풀이
        - (A+B)%C == ((A%C)+(B%C))%C
        - S[j]-S[i] 는 원본 배열의 i+1 ~ j 까지의 구간합
        - S[j]%M 값과 S[i]%M 값이 같다면 (S[j]-S[i])%M 은 0

     2. 손으로 풀기

        - A 배열의 합 S를 생성
        - 합 배열 S의 모든 값을 M으로 나눈 나머지 연산을 수행해 값 업데이트, 0 개수 세어 더함
        - 변경된 합 배열에서 원소 값이 같은 2개의 원소를 뽑는 모든 경우의 수 구하기

    3. 슈도 코드 작성
        - N 입력 받기 (수열 개수)
        - M 입력 받기 (나누어 떨어져야 하는 수)
        - S 선언 (합 배열)
        - C 선언 (같은 나머지의 인덱스를 카운트 하는 배열)

    4. 코드 구현
     */
