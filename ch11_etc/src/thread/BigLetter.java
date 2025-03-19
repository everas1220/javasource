package thread;

public class BigLetter {
    public static void main(String[] args) {
        
        
    Thread t3 = new Thread(new Runnable()){
  
        @Override
        public void run() {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                System.out.println(ch + "\t");
            }              
        }

        Runnable r = () -> {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                System.out.println(ch + "\t");
            }  
        };
        Thread t4 = new Thread();

        Thread t1 = new SmallLetters();
        

        }
    }
}
