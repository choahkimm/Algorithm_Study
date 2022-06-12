package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment3_3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // array -> list
        List<int[]> list = Arrays.asList(arr);

        // int[] -> Integer[]
        Integer[] numInt = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(numInt, Collections.reverseOrder());

        for ( Integer n : numInt ) {
            System.out.println(n);
        }
    }
}

