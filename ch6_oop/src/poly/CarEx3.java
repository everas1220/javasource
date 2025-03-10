package poly;

public class CarEx3 {
    public static void main(String[] args) {
        HankookTire frontleft = new HankookTire(1, "앞 왼쪽");
        HankookTire frontRight = new HankookTire(1, "앞오른쪽");
        HankookTire backtLeft = new HankookTire(1, "뒤왼쪽");
        HankookTire backtRight = new HankookTire(1, "뒤오른쪽");

        Car3 car3 = new Car3(frontleft, frontRight, backtLeft, backtRight);

        System.out.println(car3.num);
        System.out.println(car3.frontLeft);

        System.out.println(car3.frontLeft.accmulateRotation);
    }
}
