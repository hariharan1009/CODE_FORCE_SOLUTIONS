import java.util.Scanner;

public class Queue_at_the_School {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int t=sc.nextInt();
        String s=sc.next();
        char[] c=s.toCharArray();
        for(int i=0;i<t;i++){
            char[] x=c.clone();
            for(int j=0;j<n-1;j++){
                if(c[j]=='B' && c[j+1]=='G'){
                    x[j]='G';
                    x[j+1]='B';
                }
            }
            c=x;
        }
        System.out.println(new String(c));
    }
}
