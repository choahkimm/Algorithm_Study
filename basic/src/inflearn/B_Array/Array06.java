package inflearn.B_Array;

import jdk.internal.org.objectweb.asm.util.ASMifiable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array06 {
    // 6. 뒤집은 소수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        boolean isPrime = true;

        ArrayList list= new ArrayList();
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt(); // 입력한 수 배열 arr에 저장
            // 하나하나 배열을 돌면서 소수인지 판별
            // =>소수 n은 2~n-1까지 존재하는 소수들 중 어떤 것이라도 나누어떨어지지 않는다.

            for(int j=2; j<arr[i]; j++){
                if(arr[i] % j == 0) {
                    isPrime = false;
                    System.out.println("arr["+i +"]=" + arr[i] +", j는 "+j + ", 나눠서 나머지는 " + (arr[i]%j));

                    break;

                }
            }

            if(isPrime){
                list.add(arr[i]);
                //System.out.println(arr[i]+"=> 소수");
            }else {
                list.add("잉");
                //System.out.println(arr[i]+"=> 소수 아님");
            }
        }
        System.out.println(list);







//        for(int r : arr){
//            System.out.println(r);
//        }

    }

}

/*
6. 뒤집은 소수
설명

N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.

예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.

첫 자리부터의 연속된 0은 무시한다.


입력
첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.

각 자연수의 크기는 100,000를 넘지 않는다.


출력
첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.


예시 입력 1

9
32 55 62 20 250 370 200 30 100
예시 출력 1

23 2 73 2 3
 */