package api.util;

import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
    public static void main(String[] args) {
        Set<Integer> lotto2 = new TreeSet<>();

        // 6개 숫자 무작위 추출
        for (int i = 0; lotto2.size() < 6; i++) {
            // 로또번호 1 ~ 45
            int num = (int) (Math.random() * 45) + 1;
            lotto2.add(num);
        }
        // hashset : [3, 38, 25, 10, 28, 13] 미정렬
        System.out.println(lotto2); // [10, 11, 16, 20, 34, 40] 정렬
    }
}
