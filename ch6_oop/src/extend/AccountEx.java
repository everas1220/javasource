package extend;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account("110-11", "홍길동", 10000000);

        System.out.println("계좌번호 :" + cAccount.getAccount());
        System.out.println("계좌주 : " + cAccount.getOwner());
        System.out.println("잔액 : " + cAccount.getBalance());
        System.out.println("체크카드번호 :" + cAccount.getCardio());

        try {
            System.out.println("현재 잔액 :" + cAccount.pay("123-1232", 1000));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // CreditLineAccount
        CreditLineAccount creditLineAccount = new CreditLineAccount("110-11", "hong", 100000, 3000000);
        try {
            creditLineAccount.withdraw(2500000);
            System.out.println("현재잔액 : " + creditLineAccount.getBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}