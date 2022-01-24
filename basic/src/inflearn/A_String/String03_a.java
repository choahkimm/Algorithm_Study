package inflearn.A_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class String03_a {
    // 3. 문장 속 단어

    public static String solution(String str) {
        String answer = "";

        // (1) split
//        int max = Integer.MIN_VALUE;
//        String[] s = str.split(" ");
//        for(String x : s) {
//            int length = x.length();
//            if (length > max) {  // 최대값 구하는 알고리즘
//                max = length;
//                answer = x;
//            }
//        }

        // (2) index of (문자열 내에서 특정한 문자열의 index 값을 리턴한다)
        int max = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' ')) != -1){ // 띄어쓰기를 발견 못하면 -1 리턴하니까..
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

        return answer;

        // 참고 : MIN_VALUE 말고 0 해도 됨
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(solution(str));
    }
}


/**
 * 3. 문장 속 단어
 * 설명
 *
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 *
 * 문장속의 각 단어는 공백으로 구분됩니다.
 *
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * 출력
 * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
 */

