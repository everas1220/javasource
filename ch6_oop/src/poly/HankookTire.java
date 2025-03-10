package poly;

public class HankookTire extends Tire {

    public HankookTire(int maxRotation, String location) {
        super(maxRotation, location);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean roll() {
        ++accmulateRtation;
        
        if (accmulateRtation , maxRotation) {
            System.out.println(location + "Tire 수명" + (maxRotation)+"회");
            return true;
        } else {
            System.out.println("****" +location + " Tire 펑크 ***");
            return true;
        }
    }
}
