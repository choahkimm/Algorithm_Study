package inflearn.B_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array02 {
    // 2. 보이는 학생
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 8 명
        int[] arr = new int[num];

        // 입력받은 학생 키를 최대키와 비교하여 저장
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt(); //130 135 148 140 145 150 150 153
        }

        ArrayList<Integer> answer = new ArrayList<>();
        int tallest = arr[0];
        answer.add(0,tallest);

        for(int i=1; i<num; i++){ // index 1부터 시작
            if(arr[i] > tallest){
                tallest = arr[i];
                answer.add(arr[i]);
            }
        }
        System.out.println(answer.size());
        // 답은 맞았지만, 굳이 배열로 또 저장할 필요가 없었다!!!
        // 그냥 answer를 int로 해서... if조건에 해당하면 1씩 증가하게 하면 될 것을..
    }
}



/*
2. 보이는 학생
설명

선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는

선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)


입력
첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.


출력
선생님이 볼 수 있는 최대학생수를 출력한다.


예시 입력 1

8
130 135 148 140 145 150 150 153
예시 출력 1

5
 */