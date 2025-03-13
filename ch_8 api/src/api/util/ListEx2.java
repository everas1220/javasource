package api.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 요소 추가
        list.add("사과");
        list.add("포도");
        list.add("귤");
        list.add("오렌지");
        list.add("수박");
        list.add("파인애플");
        list.add("망고");

        // 제거
        System.out.println("index 를 이용한 제거" + list.remove(1));
        System.out.println("아이템 제거" + list.remove("귤"));

        // for문
        // 배열 : length ,
        // list : size()
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s\t", list.get(i));
        }
        System.out.println();

        // 향상된 for 문이 조금더 편한 코드작성 가능
        for (String str : list) {
            System.out.printf("%s\t", str);
        }
        System.out.println();

        System.out.println("리스트에 특정 단어 포함 여부" + list.contains("수박"));
        System.out.println("리스트에 특정 단어 포함 인덱스(위치)" + list.indexOf("망고"));

        // int[] arr = {}
        // 배열 => 리스트 반환(조회용)
        // Arrays : 배열에 필요한 유용한 메소드 제공
        String strArr[] = { "사과", "오렌지", "수박", "파인애플", "망고", "수박", "포도" };
        List<String> list2 = Arrays.asList(strArr);
        System.out.println("조회" + list2.get(3));
        // .UnsupportedOperationException
        // System.out.println("삭제" + list2.remove(2));
        // list2.add("딸기");

        // 배열 => 리스트변환 (조회 + 변환)
        List<String> list3 = new ArrayList<>(Arrays.asList(strArr));
        list3.add("딸기");
        list3.remove(3);

        // 리스트 => 배열
        Object[] arrs = list3.toArray();
        System.out.print(Arrays.toString(arrs));
    }
}
