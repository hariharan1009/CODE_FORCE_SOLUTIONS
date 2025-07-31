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
        int zv=0;
        for(int i=0;i<n;i++){
            if(a[i]>=a[x-1]){
                c++;
            }
            if(a[i]==0){
                zv++;
            }
        }
        if(zv==(n-1)){
            c=0;
        }
        System.out.print(c);
    }
}
