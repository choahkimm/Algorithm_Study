package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Beakjoon3059 {
    // 백준 3059. 등장하지 않는 문자의 합
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int sum = 0;

        //A~Z까지의 아스키 코드값의 합
        for(int i=0; i<26; i++){
            sum+='A'+i;
        }
        // A~Z 아스키 코드 합 - 입력된 알파벳 합
        for(int i=0; i<T; i++)
        {
            int inputSum= 0;
            String S = br.readLine();
            char [] ch = S.toCharArray();
            HashSet<Integer> Sset = new HashSet<>();

            for(int j=0; j<S.length(); j++){
                // 중복값을 허용하지 않는 Set
                Sset.add((int)ch[j]);
            }
            // set의 합
            for(int val : Sset){
                inputSum += val;
            }
            System.out.println(sum-inputSum);
        }
    }
}
