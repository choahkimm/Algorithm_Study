package inflearn.D_HashMap_HashSet_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class D01_a {
    public static char solution(int n, String s) {
        //1. 학급 회장(해쉬)
        char answer=' ';

        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s.toCharArray()){
            //getOrDefault : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
            map.put(x, map.getOrDefault(x,0)+1);
            // key : A B C ..   & value : 1 ,2, 3 ..
            // 참고 : map.put(x, map.get(x)) 이 아닌 이유 : key값은 있지만 value는 없을 수도 있다.
        }
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
//            System.out.println(x + " " + map.get(x));
            if(map.get(key) > max){
                max= map.get(key);
                answer = key;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        // 1. 학급 회장(해쉬)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(n,str));
    }

}
/*
1. 학급 회장(해쉬)
설명

학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.

투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.

선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.

반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.


입력
첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.

두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.


출력
학급 회장으로 선택된 기호를 출력합니다.


예시 입력 1

15
BACBACCACCBDEDE
예시 출력 1

C
 */
