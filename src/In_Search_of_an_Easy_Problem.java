import java.util.Scanner;

public class In_Search_of_an_Easy_Problem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        String s="EASY";
        for(int i=0;i<n;i++){
            if(a[i]==1){
                s="HARD";
            }
        }
        System.out.println(s);

    }
}
