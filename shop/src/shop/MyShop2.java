package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShop2 implements IShop {

    private String title;
    // 고객 5명 저장 가능한 배열 생성
    private List<User> users = new ArrayList<>();

    private List<Product> products = new ArrayList<>();

    List<Product> cart = new ArrayList<>();

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        // 2명의 User 생성 후 배열 객체에 담기
        users.add(new User("홍길동", PayType.CARD));
        users.add(new User("이춘향", PayType.CASH));
    }

    @Override
    public void genProduct() {
        // 5개 제품 생성후 배역객체에 담기(tv 2개 , cellphone 3개)
        products.add(new CellPhone("갤럭시 S25", 1260000, "SKT"));
        products.add(new CellPhone("아이폰", 1300000, "U+"));
        products.add(new Tv("삼성 올레드", 198000, "4K"));
        products.add(new Tv("삼성 QLED", 2980000, "QLED"));
        products.add(new CellPhone("갤럭시 A3", 450000, "KT"));
    }

    @Override
    public void start() {
        System.out.println(title + " 메인화면 - 계정선택 ");
        System.out.println("=============================================");
        int i = 0;
        for (User user : users) {
            if (user != null) {
                System.out.printf("[%d] %s(%s)\n", i++, user.getName(), user.getPayType());
            }
        }
        System.out.println("[X] 종료");
        System.out.println("=============================================");
        System.out.println("선택 : ");

        String input = sc.nextLine();
        switch (input) {
            case "x":
            case "X":
                System.exit(0);
                break;
            case "0":
            case "1":
                selUser = input;
                ProductList();
                break;
            default:
                System.out.println("입력을 확인해주세요");
                start();
                break;
        }
    }

    public void ProductList() {
        System.out.println(title + " 상품목록 - 상품선택 ");
        System.out.println("=============================================");
        int i = 0;
        for (Product product : products) {
            if (product != null) {
                System.out.printf("[%d],i++");
                product.printDetail();
            }
        }
        System.out.println("[h] 메인화면");
        System.out.println("[c] 체크아웃");
        System.out.println("=============================================");
        System.out.print("선택 : ");

        // 0~4 or h or c
        String input = sc.nextLine();

        switch (input) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":

                cart.add(products.get(Integer.parseInt(input)));
                ProductList();
                break;
            case "h":
                start();
            case "c":
                checkout();
                break;
            default:
                break;
        }
    }

    public void checkout() {
        System.out.println(title + " : " + users.get(Integer.parseInt(selUser)).getName() + "체크아웃");
        System.out.println("=============================================");
        int i = 0, sum = 0;
        for (Product product : cart) {
            if (product != null) {
                System.out.printf("[%d] %s (%d)\n", i++, product.getPname(), product.getPrice());
                sum += product.getPrice();
            }
        }
        System.out.println("결제방법 : CARD or CASH");
        System.out.println("합계 :" + sum);
        System.out.println("=============================================");
        System.out.println("[p] 이전");
        System.out.println("[q] 종료");
        System.out.print("선택 :");

        String input = sc.nextLine();
    }

}