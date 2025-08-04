import java.util.Scanner;

public class Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int sum=0;
        for(int i=0;i<=w;i++){
            sum+=i*k;
        }
        if(sum<n){
            System.out.print("0");
        }
        else{
            System.out.print(sum-n);
        }

    }
}
