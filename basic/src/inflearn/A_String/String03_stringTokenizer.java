package inflearn.A_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class String03_stringTokenizer {
    // 3. 문장 속 단어

//문자열이 특정 구분자(delimiter)로 연결되어 있을 경우, 구분자를 기준으로 부분 문자열을 분리하기 위해서는
//String의 split() 메소드를 이용하거나
//java.util 패키지의 StringTokenizer 클래스를 이용할 수 있다

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis(); //시작하는 시점 계산

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

// (+) StringTokenizer 이용 : 문자열을 쪼개서 문자열 단위로 리턴
        // 배열로 담아서 비교해야 하기 때문에 이 방법은 안 썼다 함...
        // 그러나, split() 이랑 성능차이 있을 수도
        // (StringTokenizer에 여러 구분자를 세팅하고, 구분자가 유니코드인 경우, hasMoreToken이 잦을 수록, 성능이 확 나빠질 수 있다)

        // 메서드 :
        // countTokens() : 남아있는 토큰 수 int 반환
        // hasMoreTokens() : 토큰 남아있는지 여부 boolean 반환
        // nextToken() : 토큰 String 반환

        StringTokenizer st = new StringTokenizer(str); // 구분자 입력하지 않을 경우 공백
        // 문자열 ->> 배열로 파싱

        // (1) hasMoreTokens()로 총 토큰의 개수를 구하고
        int tokens = st.countTokens();

        // (2) token들 담을 배열을 만들고
        String[] strArr = new String[tokens];
        // (3) nextToken()으로 한 토큰씩 꺼내서 배열에 저장
        int idx = 0;
        while(st.hasMoreTokens()){
            strArr[idx++] = st.nextToken(); // 인덱스 하나 하나에 저장
        }
      //  System.out.println(Arrays.toString(strArr));
        // (4) 배열 비교
        String answer = "";

        for(String s : strArr){
            if(s.length() > answer.length())
                answer = s;
        }

        System.out.println(answer);

        long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
        System.out.println( "실행 시간 : " + ( end - start )/1000.0 + "초"); //실행 시간 계산 및 출력
    }

    }


