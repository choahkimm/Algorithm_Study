package inflearn.A_String;

import java.util.Scanner;

public class String10_a {
    //10. 가장 짧은 문자거리
    // 각 문자의 좌측에 있는 가까운 문자 t로부터의 거리,
    // 우측에 있는 가까운 문자 t로부터의 거리를 구한다.
    // 둘 중 작은 값이 최소 거리

    // p=1000 으로 두는 이유 (100을 넘지 않기에 100도 무방)
    // A문자처럼 왼쪽이나 오른쪽에 타겟문자가 없을 경우 거리를 큰 숫자로 해야
    // 반대방향의 거리가 작은 값이 되어 선택되게 됩니다.
    // 그래서 p=1000으로 넉넉하게 잡습니다.
    // 입력되는 문자열의 길이가 100을 넘지 않기 때문에 1000이면 넉넉하게 큽니다.

    public static int[] solution(String str, char t){
        int[] answer = new int[str.length()];
        int p = 1000;

        // 왼쪽 t로 부터 떨어진 거리
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i)==t){
                p=0;
                answer[i]=p;
            }
            else {
                p++;
                answer[i]=p;
            }
        }

        // 오른쪽 t로 부터 떨어진 거리
        p=1000;
        for(int i= str.length()-1; i>=0; i--){
            if(str.charAt(i)==t){
                p=0;
            }
            else {
                p++;
                // 기존값과 비교하여 작은 값 넣기
                answer[i] = Math.min(answer[i],p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for(int x: solution(str,c)){
            System.out.print(x + " ");
        }
    }
}


/*
10. 가장 짧은 문자거리
설명

한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.

문자열의 길이는 100을 넘지 않는다.


출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.


예시 입력 1

teachermode e
예시 출력 1

1 0 1 2 1 0 1 2 2 1 0
 */