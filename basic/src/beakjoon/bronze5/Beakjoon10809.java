package beakjoon.bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10809 {
    // 백준 10809. 알파벳 찾기
    // 아스키 코드 꼭 숙지할 것
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26]; // 알파벳 길이

        // 모두 -1로 초기화
        for(int i=0; i<arr.length; i++){
            arr[i]=-1;
        }

        // 받은 문자열을 char로 하나씩 저장
        String s = br.readLine();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            // arr 원소 값이 -1인 경우에만
            if(arr[c - 'a'] == -1){
                arr[c - 'a'] = i;
            }
        }
        /*
 ch 의 문자의 위치를 우리가 앞서 만든 arr 배열의 값으로 바꿔준다.
이때 문제에서 위치는 0 부터 시작한다고 했으니 ch 의 문자의 위치는 i 가 되는 것을 알 수 있다.
또한 arr 배열의 인덱스(원소 위치)는 ch 가 갖고 있는 문자 인코딩 값(=아스키코드 값과 동일)에 'a' 또는 97 을 빼주면 된다.
( a 는 10진수로 97 이라는 값에 대응된다.)
 만약 b 라는 문자가 ch 에 담겨있을 경우 b - 'a' 또는 b - 97 을 하면 1 이 되고, arr[1] 은 문자 b를 가리키는 것을 의미한다.
         */

        // 배열 출력
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}

/* 또 다른 방법
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

	    String x = sc.next();
	    for(int i=97; i< 123 ; i++) {
	    	System.out.print(x.indexOf((char)i)+" ");
	    }
    }


 */
