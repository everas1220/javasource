package condition;

public class ifTest5 {
    public static void main(String[] args) {
      //주사위 1~6

      //0.4892214763781262
      // 0.0 <= Math.random() < 1.0
      System.out.println(Math.random());

      //(int)(Math.random() * 6) : 0~5
      int num = (int)(Math.random() * 6) + 1;

      //num 이 1이면 주사위 1이 나왔습니다.
      if (num == 1) {
         System.out.println("주사위 1번이 나왔습니다");
      } else if(num == 2){
         System.out.println("주사위 2번이 나왔습니다");
      } else if(num == 3){
         System.out.println("주사위 3번이 나왔습니다");
      } else if(num == 4){
         System.out.println("주사위 4번이 나왔습니다");
      } else if(num == 5){
         System.out.println("주사위 5번이 나왔습니다");
      }  else { 
         System.out.println("주사위 6번이 나왔습니다");
      }
   }
}