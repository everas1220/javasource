package api.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d); // thu Mar 13 13:02:55 KST 2025

        // yyyy : 년도 4자리, yy : 년도 2자리
        // MM : 월 2, 1~9월 01
        // dd : 일 2
        // hh : 시
        // mm : 분
        // ss : 초
        // a : AM/PM

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(d)); // 2025-03-13

        sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("오늘은 E요일입니다");
        System.out.println(sdf.format(d));

    }
}
