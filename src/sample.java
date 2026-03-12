import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       if(n<2000){
           System.out.println("25 minutes");
       }
       else if(n<4000){
           System.out.println("35 minutes");
       }
       else if(n<7000){
           System.out.println(" 45 minutes");
       }
       else if(n==0){
           System.out.println("0 Minutes");
       }

    }
}
