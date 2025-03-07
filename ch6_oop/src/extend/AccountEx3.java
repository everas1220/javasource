package extend;

import java.util.Scanner;

public class AccountEx3 {

    private static Account account[] = new Account[100];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    private static void createAccount(){

        System.out.print("계좌번호 : ");
        String ano = sc.nextLine();

        System.out.print("계좌주 : ");
        String owner = sc.nextLine()

        System.out.print("금액 : ");
        int balance = Integer.parseInt(sc.nextLine())

        for (int j = 0; j < args.length; j++) {
            if (account[j] == null) {
                account[j] = new Account(ano, owner, balance);
                System.out.println("계좌가 생성 되었습니다.");
                break;
            }
        }
    }

    private static void accountList() {
        System.out.println("--------------------------");
        System.out.println("계좌 목록");
        System.out.println("--------------------------");

        // for (int i = 0; i < args.length; i++) {
        // if (account[i] != null) {
        // System.out.printf("%s\t%s\t%d\n",account[i].getAno(),account[i].getOwner(),account[i].getBalance());
        // }
        // }
        for (Account acc : account) {
            if (acc != null) {
                System.out.printf("%s\t%s\t%d\n", account.getAno(), account.getOwner(), account.getBalance());
            }
        }
    }

    private static void deposit() {
    System.out.println("선택 >>  ");
    int menu = Integer

    private static void accountList(Account account);

    System.out.println("------------------------");System.out.println("계좌 목록");System.out.println("------------------------");

    System.out.printf("%s\t%s\t%d\n",account.getAno(),account.getOwner(),account.getBalance());

    }

    private static void deposit(Account account) {
        // 예금하다
        // 계좌번호 입력받기 => 사용자가 입력한 계좌 번호와 account 의 계좌번호 일치 여부 확인
        System.out.print("계좌번호 : ");
        String ano = sc.nextLine();

        if (!ano.equals(account.getAno()))
            return;

        // 예금액 입력받기 => 잔액 = 잔액 +예금액
        System.out.print("예금액 :");
        int balance = Integer.parseInt(sc.nextLine());

        Account findacc = findAccount(ano);
        // findAcc 가 널일때. 메서드에 접근하면 nullPointerException 발생
        if (findAcc != null) {
            findAcc.deposit(balance);
        }
        findAcc.deposit(balance);
    }

    private static void withdraw() {
    System.out.print("계좌번호 :");
    String ano = sc.nextLine();
    System.out.print("출금액 :");
    int balance =Integer.parseInt(ano)

    private static Account findAccount(String ano) {
        for (int i = 0; i < account.length; i++) {
            // null 이 아니여야 하고 account[i].getAno() == ano break;
            if (account[i].getAno.equals(ano)) {
                // return account[i];
                // //break;
                // }

                if (account[i].getAno().equals(ano)) {
                    acc = account[i];
                    break;
                }
            }
            // return account[i]

            return acc;
                }
            }
        }
    }
}