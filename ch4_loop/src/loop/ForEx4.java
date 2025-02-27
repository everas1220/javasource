package loop;

public class ForEx4 {
    public static void main(String[] args){

        //1~10 까지의 합
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            // sum = sum +i;
            sum +=i;
        }
        System.out.println("1~10 까지의 합 "+sum);
   
        //1~100 까지 수 중에서 3의 배수 출력
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.println(i + "\t");


                
            }
        }
    }
}
