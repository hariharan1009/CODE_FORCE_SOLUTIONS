import java.util.Scanner;

public class Next_Round {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        int xv =a[x-1];
        for(int i:a){
            if(xv<=i && i>0){
                c++;
            }
        }
        System.out.print(c);
    }
}
