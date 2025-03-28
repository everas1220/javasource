package api.util;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayEx1 {
    public static void main(String[] args) {

        String str;

        Integer[] arr = { 33, 24, 15, 66, 7 };
        System.out.println(arr);
        System.out.println("배열 값 출력" + Arrays.toString(arr));

        // 오름차순
        Arrays.sort(arr, Comparator.reverseOrder());

        // 정렬
        Arrays.sort(arr);
        System.out.println("정렬 후 " + Arrays.toString(arr));

        // 문자 정렬
        Character[] characters = { 'a', 'k', 'b', 't', 'o' };
        Arrays.sort(characters, Comparator.naturalOrder());
        System.out.println(Arrays.toString(characters));
    }
}
