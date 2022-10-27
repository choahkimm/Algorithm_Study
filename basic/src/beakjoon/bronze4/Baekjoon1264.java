package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1264 {
    // 백준 1264
    // 모음의 개수

    // 영문 문장을 입력받아 모음의 개수를 세는 프로그램을 작성하시오.
    // 모음은 'a', 'e', 'i', 'o', 'u'이며 대문자 또는 소문자이다.

    public static void main(String[] args) {
        // Scanner 말고 Buffered reader 쓰도록 하자 - 처리 속도 향상
    /*
    InputStream 은 바이트 단위로 데이터를 처리한다. 또한 System.in 의 타입도 InputStream 이다.
    InputStreamReader 은 문자(character) 단위로 데이터를 처리할 수 있도록 돕는다. InputStream 의 데이터를 문자로 변환하는 중개 역할을 한다.
    BufferedReader 은 스트림에 버퍼를 두어 문자를 버퍼에 일정 정도 저장해둔 뒤 한 번에 보낸다.
     */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        try {
            while ((line = br.readLine()) != null)
            {
                int cnt=0;

                if(line.equals("#")) break;
                for(int i=0; i<line.length(); i++){
                    if(line.charAt(i)=='a' ||line.charAt(i)=='e'||
                    line.charAt(i)=='i'||line.charAt(i)=='o'||line.charAt(i)=='u'
                    ||line.charAt(i)=='A' ||line.charAt(i)=='E'||
                            line.charAt(i)=='I'||line.charAt(i)=='O'||line.charAt(i)=='U')
                       cnt++;
                }
                System.out.println(cnt);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
