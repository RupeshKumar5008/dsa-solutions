import java.util.*;
public class DomainPilling {
  public static void main(String[] args) {
    // System.out.println("hello");
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int cols=sc.nextInt();
    int size=2*1;
    int result=(row*cols)/size;
    System.out.println(result);
  }
}
