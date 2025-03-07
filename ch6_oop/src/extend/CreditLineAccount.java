package extend;

public class CreditLineAccount {

    private int CreditLine;

    public CreditLineAccount(String anoo, String owner, long balance, int creditLine) {
        super(ano, owner, balance);
        this.CreditLine = creditLine;
    }

    // 오버라이딩
    // 잔액 + 마이너스 한도 < 사용액

    @Override
        void withdraw(long amount) throw Exception {
            if (super.getbalance() +  this.creditLine < amount) {
                throw new Exception("한도 범위를 초과합니다");
            }
            //잔액 = 잔액 -사용액
            super.setBalance(super.getbalance() - amount);
    }

    public String getBalance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBalance'");
    }
}
