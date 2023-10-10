package beakjoon.bronze2;

import java.io.*;

public class Beakjoon2231 {
    // 백준 2231. 분해합
    // 완전 탐색 - 브루트포스 알고리즘
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // ex: 256 (=245 +4+5)
        int result = 0; // ex: 245

        for(int i=0; i<n; i++){
            int number = i; // 생성자 (ex: 245)
            int sum = 0; // 분해합을 저장할 변수 (ex: 4+5)

            // 생성자가 0이 될 때까지 각 자리수를 더함
//            while (number != 0){
//                sum += number%10; // 각 자릿수 더하기
//                number/=10;
//            }
            while (true) {
                sum += number%10;
                number/=10;

                if(number==0){
                    break;
                }
            }

            // 생성자(i)와 분해합(sum)을 더해서 n이 나오면 찾는 값인 생성자를 정답으로 출력
            if(sum + i == n){
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
