package api.object;

public class Object {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();

        // 주소값이 같냐? = (같은 인스턴스를 가리키고 있냐)
        System.out.println(object1.equals(object2) ? "같음" : " 다름");
        System.out.println(object1 == object2 ? "같음" : " 다름");

        // 패키지명.클래스명@hashcode
        System.out.println("Object toString()" + object1.toString());

        Value value1 = new Value(10);
        Value value2 = new Value(10);

        // 부모가 상속 시 참조변수의 주소값 비교
        // 멤버 변수의 값 비교 equals 재정의: 멤버변수 value의 값이 같은값인지 비쇼
        System.out.println(value1.equals(value2) ? "value1 == value2" : "value1 != value2");
        System.out.println("Value toString()" + value1.toString());

        Persen p1 = new Persen("hong123", "홍길동");
        Persen p2 = new Persen("hong123", "박길동");

        System.out.println(p1.equals(p2) ? "p1 == p2" : "p1 != p2");
        System.out.println("Person toString" + p1.toString());
    }
}
