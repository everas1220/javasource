package extend;

public class BonusPointAccount extends Account {

    private int bonusPoint;

    public BonusPointAccount(String ano, long Balance, int bonusPoint) {
        super(ano, owner, balance);
        this.bonusPoint = bonusPoint;
    }

    public int getBonuspoint() {
        return bonusPoint;
    }

    // 보너스포인트 = 보너스 포인트 +(예금액 * 1%)
    // 예금하다 메서드
    @Override
    void deposit(long amunt) {

        super.deposit(amunt);

        bonusPoint += amunt * 0.01;
    }
}
