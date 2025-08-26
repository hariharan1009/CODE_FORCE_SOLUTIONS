import java.util.Scanner;

public class A_Team {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int co=0;
        while(n-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if((a+b+c)>=2){
                co++;
            }

        }
        System.out.print(co);
    }
}
