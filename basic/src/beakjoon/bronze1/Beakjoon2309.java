package beakjoon.bronze1;

import java.io.*;
import java.util.Arrays;

public class Beakjoon2309 {
    // 백준 2309. 일곱 난쟁이
    // 브루트포스 알고리즘, 정렬
    public static void main(String[] args) throws IOException {
        // 9개의 줄에 걸쳐 난쟁이들의 키가 주어짐, 7 난쟁이 합은 100

        // 1. 9난쟁이들의 키를 입력받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int dwarf [] = new int[9];
        int sum =0;

        for(int i=0; i<9; i++){
            dwarf[i] = Integer.parseInt(br.readLine());
            sum += dwarf[i];
        }

        // 2. 7난쟁이 선별 (합 100) : 9명 키 - 2명 키 = 100
        checkSeven(dwarf, sum);

        // 3. 7난쟁이 키를 오름차순으로 출력
        Arrays.sort(dwarf);

        for(int i=0; i<7; i++){
            bw.write(dwarf[i]+ "\n");
        }
        bw.flush();
        br.close();

    }

    private static void checkSeven(int[] dwarf, int sum) {
        for(int i=0; i<9; i++){
            for(int j=i+1; j<9; j++){
                // 합이 100이 아닌 경우 현재 반복에서 난쟁이를 선택하지 않은 채로 다음 조합 검사
                if(100 !=  sum - dwarf[i] - dwarf[j]){
                    continue; // 모든 경우의 수 판별
                }
                // 선택된 두 명의 일곱 난쟁이를 최대값으로 변경하여 이후 과정에서 일곱 난쟁이 탈락하게.
                dwarf[i] = Integer.MAX_VALUE;
                dwarf[j] = Integer.MAX_VALUE;

                return;
            }
        }
    }
}
