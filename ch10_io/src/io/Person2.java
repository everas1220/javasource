package io;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@RequiredArgsConstructor // @nonNull(+final) 이 들어간 변수를 포함한 생성자
@AllArgsConstructor
@Getter
@ToString
public class Person2 {
    @Setter // 해당하는 멤버 변수의 setter 메소드만 생성
    private String pno;
    @NonNull
    private String name;
    private String tel;

}
