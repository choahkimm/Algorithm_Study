package inflearn.A_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String03_indexOf {
    public static void main(String[] args) throws IOException {
        // IndexOf 이용 - 문자열 내에서 특정한 문자열의 index 값을 리턴한다.

        // 특징1. index는 0부터 시작
        // 특징2. 찾는 문자열이 없을 경우 -1 을 리턴

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String answer="";

        int max = Integer.MIN_VALUE, pos;
        while((pos = str.indexOf(" ")) != -1){ // 띄어쓰기를 발견 못하면 -1 리턴하니까..
            // 발견하면 index 번호 리턴
            String tmp = str.substring(0, pos);
            int length = tmp.length();
            if(length > max){ // 길이가 같다면 앞 단어로..
                max = length;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length() > max) answer=str; // 마지막 단어 처리!

        System.out.println(answer);
    }
}
