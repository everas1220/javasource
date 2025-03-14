package api.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListEx6 {
    public static void main(String[] args) {

        // ------
        // 한 어린이의 키를 2015~ 2024 사이의 1년단위로 입력받기
        // 입력받은 데이터는 ArrayList에 저장한다 가장 키가많이 자란 년도 출력
        // 입력 예시 120 122 125 130 139 160 173 175

        Scanner sc = new Scanner(System.in);
        System.out.println("10년 동안의 키를 입력해주세요");
        System.out.println(">>");
        String input = sc.nextLine();

        List<Integer> list = new ArrayList<>();

        StringTokenizer tokenizer = new StringTokenizer(input);
        while (tokenizer.hasMoreTokens()) {
            list.add(Integer.parseInt(tokenizer.nextToken()));
        }

        // 키가 가장 많이큰 년도 cm 출력
        int diff = 0;
        int pos = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            int sub = list.get(i + 1) - list.get(i);
            if (diff < sub) {
                diff = sub;
                pos = i;
            }
        }

        System.out.println("가장 키가 많이 자란 년도는" + (pos + 2015) + "년,키는" + diff + "cm");

        sc.close();
    }
}