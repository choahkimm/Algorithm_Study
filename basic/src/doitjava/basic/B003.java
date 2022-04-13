package doitjava.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B003 {
    // 03-2 구간 합
    // 003.구간 합 구하기 (백준 온라인 저지 11659)
    public static void main(String[] args) throws IOException {
        // 1. 데이터 개수, 질의 개수를 입력 받는다
        // 2. 구간 합을 구할 대상을 입력받아서 배열에 저장 (for)
        // 3. 합 배열 만들기

        // 슈도코드
        /**
         * sunNO(숫자 개수), quizNo(질의 개수) 저장하기
         *
         * for(숫자 개수만큼 반복){ 합 배열 생성 S[i] = S[i-1]+A[i] }
         * for(질의 개수만큼 반복){ 질의 범위 받기(i~j) 구간 합 출력 S[j]-S[i-1]}
         **/

        // 구간 합 공식 S[j] - [i-1]

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int suNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());

        long[] S = new long[suNo + 1]; // Sum 배열
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= suNo; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        } //S[1], S[2] .. 이렇게  sum을 저장

        for (int q = 0; q < quizNo; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j] - S[i - 1]);
        }
    }
}