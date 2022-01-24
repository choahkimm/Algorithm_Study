package inflearn.A_String;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class String04_a2 {
    // 4. 단어 뒤집기 -- StringBuilder이용법 또는 직접 뒤집기
    //  (2) 직접 뒤집기
    public static ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str){
            char[] s = x.toCharArray(); //단어를 갖는 String이 문자배열화 됨

            // [] [] [] [] []
            // lt          rt

            int lt=0, rt=x.length()-1;
            while (lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s); // valueOf : String화 시켜줌
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = sc.next();
        }
        for(String x : solution(n, str)){
            System.out.println(x);
        }
        
    }
}

/**
 * 4. 단어 뒤집기
 * 설명
 *
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 *
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * 출력
 */
