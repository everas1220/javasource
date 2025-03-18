package io;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Account {

    private String ano;
    private String owner;
    private long balance;

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
