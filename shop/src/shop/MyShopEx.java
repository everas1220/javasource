package shop;

public class MyShopEx {
    public static void main(String[] args) {
        IShop shop = new MyShop();
        // 상점이름 지정
        shop.setTitle("Myshop");
        // 고객생성
        shop.genUser();
        // 제품 생성
        shop.genProduct();
        // 상점 시작
        shop.start();
    }
}
