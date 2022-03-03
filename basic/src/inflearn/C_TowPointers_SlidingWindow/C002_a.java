package inflearn.C_TowPointers_SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C002_a {
    public static void main(String[] args) {
        // 공통원소 구하기 (two pointers algorithm)

        // 두 집합을 오름차순으로 sorting.
        // 각 집합의 인덱스를 가리킬 포인터 두개를 만든다.
        // 반복하면서 어떤 조건을 만족했을때 포인터를 이동시켜서 answer 값을 구한다.

        Scanner sc = new Scanner(System.in);
        // n 크기의 a 배열 만들기
        int n = sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }

        // m 크기의 b 배열 만들기
        int m = sc.nextInt();
        int[] b=new int[m];
        for(int i=0; i<m; i++){
            b[i]=sc.nextInt();
        }

        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);

        int p1=0, p2=0;
        while(p1<n && p2<m) {
            if(a[p1]==b[p2]){
                answer.add(a[p1++]);
                p2++;
            }
            else if(a[p1]<b[p2]) p1++;
            else p2++; // (a[p1] > b[p2]
        }

        for(int x : answer){
            System.out.print(x+" ");
        }

    }



    /*
먼저 인자로 들어온 두 배열을 sort메서드를 통해 오름차순으로 정렬한다.
결과를 담을 빈 배열 result를 만들어준다.
각 배열의 인덱스를 담당할 pointer두개를 만들어준다. 0부터 시작한다.
p1 포인터가 arr1의 배열의 길이보다 작을때, 또 p2 포인터가 arr2의 배열의 길이보다 작을때 둘다를 만족시킬때까지 반복해준다.(두 포인터를 모두 돌때까지)
만약 정렬한 arr1의 배열의 p1의 값이 arr2의 배열의 p2값과 같다면 result에 둘중의 하나 값을 담는다.(둘다 어차피 같은 값이니까)
그다음 p1이나 p2 둘중 하나의 값을 1증가시킨다.
(처음 풀때 이 부분을 처리를 안해줬더니 무한루프가 돌았다. 이 부분을 처리를 안하게 되면 처음 값이 같게 될때 그 값을 담고나서 포인터가 이동하지 않기 때문에 계속 그 자리에 머물면서 result값에 담기만 하기 때문에 무한 루프가 돌았던 것!!)
만약 한쪽의 배열의 값이 다른 배열의 값보다 작게되면 그 작은 값의 포인터를 1증가시킨다. 오름차순으로 되어있기때문에 작을때 증가시켜야 그 다음 커진 원소와 비교가 되기 때문
두개의 포인터가 끝날때까지 이 조건들을 반복한다!
profile

     */
}
