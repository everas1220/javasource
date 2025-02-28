package loop;

public class ForEx12 {
  public static void main(String[] args) {
    for (int j = 5; j > 0; j--) {
      if (j > 2) {
        System.out.print("");
      } else {
        System.out.print("*");
      }
      System.out.println();
      for (int j = 4; j > 0; j--) {
        if (j > 2) {
          System.out.print("");
        } else {
          System.out.print("*");
        }
        System.out.println();
      }
      for (int j = 3; j > 0; j--) {
        if (j > 3) {
          System.out.print("");
        } else {
          System.out.print("*");
        }
        System.out.println();
      }
      for (int j = 2; j > 0; j--) {
        if (j > 4) {
          System.out.print("");
        } else {
          System.out.print("*");
        }
        System.out.println();
        for (int j = 1; j > 0; j--) {
          if (j > 5) {
            System.out.print("");
          } else {
            System.out.print("*");
          }
        }
        System.out.println("\n\n")
        for (int i = 0; i < args.length; i++) {
          for (int j = 5; j > 0; j--) {
            if (j > i) {
              System.out.print("");
            } else {
              System.out.print("*");
            }
            System.out.println();
          }
        }
      }
    }
  }
}