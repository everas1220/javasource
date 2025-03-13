package api.util;

import java.util.LinkedList;
import java.util.List;

public class ListEx4 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        // 추가할땐 add만 붙이면 됨
        list.add("사과");
        list.add("포도");
        list.add("귤");
        list.add("망고");
        list.add("수박");
        list.add("오렌지");
        list.add("파인애플");

        for (String string : list) {
            System.out.println(string);
        }

        // 가져올땐 get만 붙이면 됨
        System.out.println(list.get(3));
        System.out.println(list.remove(3));
        System.out.println(list.indexOf("자몽"));
    }
}
