import java.util.*;
public class Tean_problem {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int max=0;
    while(n > 0){
      int count=0;
      int k=sc.nextInt();
      if(k==0){
        count++;
      }
      int l=sc.nextInt();
      if(l==1){
        count++;
      }
      int m=sc.nextInt();
      if(m==1){
        count++;
      }
      if(count >=2){
        max++;
      }
      n--;
    }
    System.out.println(max);
  }
}
