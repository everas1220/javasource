package array;

import java.util.Arrays;

public class ArrayEx12 {
    public static void main(String[] args) {
        // 배열 생성시 변수의 타입에 따라 기본값이 설정됨
        // int : 0, boolean : false, double(float) : 0.0
        // String : null

        String[] names = { "Kim,Park,Yi" };

        String[] name = new String[2];
        ;
        System.out.println();

        int[] arr1 = new int[2];
        System.out.println(Arrays.toString(arr1));

        boolean[] arr2 = new int[2];
        System.out.println(Arrays.toString(arr2));

    }
}
