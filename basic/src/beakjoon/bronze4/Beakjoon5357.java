package beakjoon.bronze4;

import java.io.*;

public class Beakjoon5357 {
    // 백준 5357. Dedupe
    // todo: 범위 설정 조심
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            // 한 글자씩 잘라서 배열에 저장
             String[] strArray = br.readLine().split("");

             bw.write(strArray[0]);

             // 두 번째 문자부터
             for(int j=1; j<strArray.length; j++){
                if(!strArray[j].equals(strArray[j-1])){
                    bw.write(strArray[j]);
                }
             }
             bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
