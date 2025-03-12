package exception;

public class Account {
    // 속성 : 꼐좌번호(ano), 이름(owner), 잔액(balance)
    // 110-10-0100
    // 기능 : 예금하다(잔액=잔액+예금액), 출금하다(잔액 = 잔액- 출금액)
    // deposit, withdraw

    String ano;
    String owner;
    String balance;

    // 생성자(defailt, 멤버 변수 3개 초기화)
    // toString

    public Account() {
    }

    public Account(String ano, String owner, long balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    // 기능 : 예금하다(잔액 = 잔액 + 예금액)
    // deposit,wi
    void deposit(long amount) {
        this.balance += amount;
    }

    void withdraw(long amount) {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    // toString
    @Override
    public String toString(){
        return "Account[ ano=" + ano +",owner=" + owner +", "
    }
}