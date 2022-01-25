package inflearn.A_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String05 {
    // 5. 특정 문자 뒤집기

    public static String soulution(String inputStr){

        // 입력 받은 문자열을 하나씩 쪼개서 써내고 배열에 담는 과정
        char[] chars =  inputStr.toCharArray(); // ex: [ a, #, b, ... ]
        int startIdx = 0;
        int lastIdx = inputStr.length()-1;

            while (startIdx < lastIdx){
                char start = chars[startIdx];
                char last = chars[lastIdx];

                if(!Character.isAlphabetic(start)) { // 시작 인덱스가 알파벳이 아닐 때
                    startIdx++;
                } else if(!Character.isAlphabetic(last)){ // 마지막 인덱스가 알파벳이 아닐 때
                    lastIdx--;
                } else {
                    char tmp = chars[startIdx];
                    chars[startIdx] = chars[lastIdx];
                    chars[lastIdx] = tmp;

                    startIdx ++;
                    lastIdx ++;
                }
            }
            // char[] => String 으로
        String answer = String.valueOf(chars);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine(); // ex: a#b!GE*T@S

        System.out.println(soulution(inputStr)); // S#T!EG*b@a
    }
}

/*
5. 특정 문자 뒤집기
설명

영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.


입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.


출력
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 */
