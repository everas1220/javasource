package poly;

public class ChildEx {
    public static void main(String[] args) {
        Child child1 = new Child();
        Parent parent = new Child();

        child1.method1();
        child1.method2();
        child1.method3();

        // parent 접근 범위
        // parent.field1;
        parent.method1();
        parent.method2();
    }
}
