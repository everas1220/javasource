package condition;

import java.util.Scanner;

public class SwichTest7 {
    public static void main(String[] args) {
     //연산자, 피연산자 입력받은 후 계산해서 결과 출력
     //+,-,*,/,%
     Scanner scanner = new Scanner((System.in));
     System.out.println("연산자 입력");
     String op = scanner.nextLine();
   
     System.out.println("첫번째 피연산자 입력");
     String input = scanner.nextLine();
     int num1 = Integer.parseInt(input);

     System.out.println("두번째 피연산자 입력");
     input = scanner.nextLine();
     int num2 = Integer.parseInt(input);

     // 5 - 3 = 2
    
    int result = 0;
     switch (op) {
        case "+":
            result = num1 + num2;
            break;
        case "-":
            result = num1 - num2;
            break;
        case "*":
            result = num1 * num2;
            break;
        case "/":
            result = num1 / num2;
            break;
        case "%":
            result =  num1 % num2;
            break;
        default:
            System.out.println("입려값을 확인해 주세요");
            break;
         }

         System.out.printf("%d %s %d = %d",num1, op,num2,result);
     }
}