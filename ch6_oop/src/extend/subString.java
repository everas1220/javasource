package extend;

public class subString {
    // 조건
    // 이름이 같아야 한다
    // 매게 변수가 같아야 한다
    // 반환타입이 같아야한다

    // 재정의 : 부모가 정의해주는 내용울 자식에 맞춰서 변경하는 개념
    // 오버로딩 vs 오버라이딩
    // 오버라이팅 상속 상속받은 메서드의 내용을 변경하는것
    // 오버로딩 : 한클래스에서 동일한 메서드를 여러개 정의하는것
    public static void main(String[] args) {
        String name ="성춘향";

        @Override
        public void list() {
            super.list();
            System.out.println(name + "하위 클래스 이름 ");



        }
    }

}
