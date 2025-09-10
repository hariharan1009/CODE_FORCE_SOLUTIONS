import java.util.Scanner;

public class Calculating_Function {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        long n = Long.parseLong(a);
        if(n%2==0) System.out.println(  n/2);
        else System.out.println(-((n/2)+1));
    }
}
