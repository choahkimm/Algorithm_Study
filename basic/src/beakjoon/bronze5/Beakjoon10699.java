package beakjoon.bronze5;

import java.text.SimpleDateFormat;

public class Beakjoon10699 {
    // 백준 10699. 오늘 날짜
    public static void main(String[] args) {
        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(form.format(System.currentTimeMillis()));
    }
}
