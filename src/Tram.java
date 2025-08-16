import java.util.Scanner;

public class Tram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        int cur=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            cur-=a;
            cur+=b;
            max=Math.max(cur,max);

        }
        System.out.print(max);
    }
}
