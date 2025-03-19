package thread;

public class AccountEx1 {
    public static void main(String[] args) {
        AccUser accUser = new AccUser();
        Thread1 t1 = new Thread(accUser);
        Thread2 t2 = new Thread(accUser);

    }
}
