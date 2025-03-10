package poly;

public class Car2 {
    // 자동차 바퀴장착
    HankookTire frontLeft = new HankookTire(6, "앞왼쪽");
    KumhoTire frontRight = new KumhoTire(2, "앞오른쪽");
    HankookTire backLeft = new HankookTire(3, "뒤왼쪽");
    KumhoTire backRight = new KumhoTire(4, "뒤오른쪽")

    int run() {
        System.out.println("[자동차가 주행중입니다]");
        if (!frontLeft.roll()) {
            stop();
            return 1;
        } else if (!frontRight.roll()) {
            stop();
            return 2;
        } else if (!backLeft.roll()) {
            stop();
            return 3;
        } else if (!frontRight.roll()) {
            stop();
            return 4;
        }
        return 0;
    }

    void stop() {
        System.out.println("[자동차가 멈춥니다]");
    }
}
