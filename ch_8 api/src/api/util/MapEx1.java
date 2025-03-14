package api.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
    public static void main(String[] args) {
        // K : String, V : String
        // 다른 값으로 지정해도 문제 없음
        Map<String, String> map = new HashMap<>();

        // 추가 map.put
        map.put("id_0111", "홍길동");
        map.put("id_0112", "김길동");
        map.put("id_0113", "강길동");
        map.put("id_0111", "박길동");
        map.put("id_0114", "최길동");

        // Key 중복 허용 불가
        // 아래와 같이 표현하면 Key 값만 가져온다
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
