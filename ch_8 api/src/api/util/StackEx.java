package api.util;

import java.util.List;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        List<String> list = new Stack<>();
        // 지금까지는 추가할때 add()를 지울때는 remove()를 사용했음

        Stack<String> stack = new Stack<>();
        stack.push("사과"); // = list.add("사과")
        stack.push("감");
        stack.push("포도");
        stack.push("수박");

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
