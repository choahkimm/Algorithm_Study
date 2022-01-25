package inflearn.A_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class String06 {
    // 6. 중복문자제거

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        String anwser = "";

        // ArrayList
        ArrayList<Character> list = new ArrayList<>();
        for (char a : inputStr.toCharArray()) {
            if (!list.contains(a)) { //(2) 넣었던 문자가 있으면 또 안 넣어주고
                list.add(a);
                anwser += a; // (1) 하나하나 다시 쌓아주기
            }
        }
        System.out.println(anwser);
    }
}
/*
6. 중복문자제거
설명

소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.

중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.


입력
첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.


출력
첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 */