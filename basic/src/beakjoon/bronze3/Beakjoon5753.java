package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon5753 {
    // 백준 5753. Pascal Library
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine(); // 한 줄을 읽어온다
        while (line != null) { // 파일이 끝날 때 까지 반복
            StringTokenizer st = new StringTokenizer(line); // line을 토큰으로 분리
            int n = Integer.parseInt(st.nextToken()); // n: 친구의 수
            int d = Integer.parseInt(st.nextToken()); // d: 날짜의 수
            if (n == 0 && d == 0) { // n, d가 모두 0인 경우, 반복문 종료
                break;
            }
            int[] attended = new int[n]; // attended: 각 친구가 참석한 날짜의 수
            for (int i = 0; i < d; i++) {
                st = new StringTokenizer(br.readLine()); // 한 줄을 읽어온다
                for (int j = 0; j < n; j++) {
                    if (Integer.parseInt(st.nextToken()) == 1) { // 해당 친구가 참석한 경우
                        attended[j]++; // 해당 친구의 attended 카운트 증가
                    }
                }
            }
            boolean found = false; // found: 모든 날짜에 참석한 친구가 있는지 여부
            for (int i = 0; i < n; i++) {
                if (attended[i] == d) { // 해당 친구가 모든 날짜에 참석한 경우
                    found = true; // found 여부를 true로 설정
                    break;
                }
            }
            System.out.println(found ? "yes" : "no"); // 모든 날짜에 참석한 친구가 있으면 yes, 없으면 no 출력
            line = br.readLine();
        }
    }
}







