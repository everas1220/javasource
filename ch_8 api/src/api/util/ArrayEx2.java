package api.util;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {

        Integer[] arr = { 33, 24, 15, 66, 7 };

        // 배열 안에 15가 들어있는가?
        Arrays.sort(arr);
        System.out.println("15 위치 = " + Arrays.binarySearch(arr, 15));

        // 배열 비교
        Integer[] arr1 = { 33, 24, 15, 66, 7 };
        Integer[] arr2 = { 37, 21, 15, 64, 8 };
        System.out.println("배열요소 비교" + Arrays.equals(arr1, arr2));
    }
}
