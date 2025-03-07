package extend;

public class TvEx {
    public static void main(String[] args) {
        Tv tv = newTv();
        tv.size = 50;
        tv.color = "black";

        Tv2 tv2 = new Tv2();

        // the field Tv2.size is not visible
        // tv2.size =60;

        Tv2 tv3 = new Tv2();
        tv3.power();
        tv3.changeChannel(11);

        obj.setSize(60);
        obj1.setColor("Green");
        System.out.println("색상 : " + obj1.getColor);
        System.out.println("사이즈 : " + obj1.getSize);
    }
}
