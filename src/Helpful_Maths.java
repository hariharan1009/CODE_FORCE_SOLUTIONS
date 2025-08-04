import java.util.Arrays;
import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] a= s.split("\\+");
        int[] b=new int[a.length];
        for (int i=0;i<a.length;i++) {
            b[i]=Integer.parseInt(a[i]);
        }
        Arrays.sort(b);
        for(int i=0;i<b.length-1;i++){
            System.out.print(b[i]+"+");
        }
        System.out.print(b[b.length-1]);

    }
}
