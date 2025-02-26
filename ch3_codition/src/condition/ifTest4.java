package condition;
import java.util.Scanner;
public class ifTest4 {
    public static void main(String[] args) {
      //score 점수를 입력받아
      //score >= 90보다 등급은 A입니다. if()
      //score >= 80보다 등급은 B입니다. elseif()
      //score >= 70보다 등급은 C입니다. elseif()
      //score >= 60보다 등급은 D입니다. elseif()
      //score < 60보다 등급은 f입니다. else()
      Scanner scanner = new Scanner(System.in);
      System.out.println("점수 입력");
      String input = scanner.nextLine();
      int score = Integer.parseInt(input);

      if (score >= 90) {
         System.out.println("등급은 A입니다");
      } else if(score >= 80){
         System.out.println("등급은 B입니다");
      } else if(score >= 70){
         System.out.println("등급은 C입니다");
      } else if(score >= 60){
         System.out.println("등급은 D입니다");
      }  else { 
         System.out.println("등급은 F입니다");
      }
      scanner.close();
   }
}