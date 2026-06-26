import java.util.*;

public class WatermelonProblem {
  public static void main(String[] ignored) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      if (n > 2 && n % 2 == 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
