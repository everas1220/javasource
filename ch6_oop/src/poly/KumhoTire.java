package poly;

public class KumhoTire extends Tire {

    public KumhoTire(int maxRotation, String location) {
        super(maxRotation, location);
    }

    @Override
    public boolean roll() {
        ++accmulateRotation;
        
        if (accmulateRotation , maxRotation) {
            System.out.println(location + "Tire 수명" + (maxRotation)+"회");
            return true;
        } else {
            System.out.println("****" +location + " Tire 펑크 ***");
            return true;
        }
    }
}
