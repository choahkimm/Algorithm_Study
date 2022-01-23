package inflearn.A_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String03_a {
    // 3. 문장 속 단어

    public static int solution(String str){
        int answer= 0;

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// 1. StringTokenizer 이용 : 결과값이 문자열 - ab cd
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        String[] strArr = new String[st.countTokens()];

        int i = 0;
        while (st.hasMoreTokens()){
            strArr[i++] = st.nextToken();  // 쪼갠 token을 배열에 담기
        }

        for(int j = 0; j< strArr.length; j++){
            //System.out.println(j + ": " + strArr[j]);
//            if(strArr[j].length() > strArr[j+1].length()){
//                System.out.println(strArr[j]);
//                if(strArr[j].length()==strArr[j+1].length()){
//                    break;
//                }
//            }
            System.out.println(strArr[j]);
        }


    }


// 2. split() 정규식 이용 : 결과값이 문자열 배열 - [ab, cd]
//        String[] strArr = br.readLine().split("\\s");
//        System.out.println(strArr);


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
