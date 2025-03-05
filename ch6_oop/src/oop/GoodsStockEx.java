package oop;

public class GoodsStockEx {
    public static void main(String[] args) {
        // new Goodsstock() : default 생성자를 호출하면서 인스턴스를 생성
        // GoodsStock goodsStock = new GoodsStock();
        // goodsStock.code = "p1013";
        // goodsStock.stockNum = 50;

        // GoodsStock goodsStock = new GoodsStock("p1013", 50)

        System.out.println(goodsStock);

        // 판매 - 5
        GoodsStock.subtractStock(5);
        // 현재 재고수량 화인
        System.out.println(GoodsStock);

        // 제품 입고 10
        GoodsStock.addStock(10);
        System.out.println(GoodsStock);

    }
}
