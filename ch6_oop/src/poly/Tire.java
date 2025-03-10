package poly;

public class Tire {
    int maxRotation;
    int accmulateRotation;
    String location;

    public Tire(int maxRotation, String location) {
        this.maxRotation = maxRotation;
        this.location = location;
    }

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
