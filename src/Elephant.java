import java.util.Scanner;

public class Elephant {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0){
            System.out.print(n/5);
        }
        else{
            System.out.print((n/5)+1);
        }
    }
}
