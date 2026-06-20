import java.util.*;

public class Way_to_longword_71A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String arr[] = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextLine();
        }

        for(int i=0; i<n; i++){

            String temp = arr[i];
            int count = temp.length();

            if(count > 10){
                System.out.println(
                    temp.charAt(0) + "" + (count-2) + temp.charAt(count-1)
                );
            }
            else{
                System.out.println(temp);
            }
        }
    }
}