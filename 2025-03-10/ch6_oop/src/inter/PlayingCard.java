package inter;

public interface PlayingCard {

    // 멤버변수 가질수 없음
    // boolean pause;

    // 상수(대문자로 선언)의 형태로만 가능
    public static final int SPADE = 4;
    // public static final 생략 가능
    int CLOVER = 1;

    // 일반메서드 가질수 없음
    // void pause() {}

    // public abstract 생략가능
    void pause();

    // static, default가 붙는다면 일반 메서드도 허용
    static void display() {

    }

    default void print() {

    }

}
