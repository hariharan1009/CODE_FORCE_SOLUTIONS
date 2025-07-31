import java.util.Scanner;

public class Way_Too_Long_Words {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        while(n--!=0){
            int c=0;
            String s=sc.next();
            if(s.length()<=10) {
                System.out.println(s);
            }
            else{
                char a=s.charAt(0);
                char b=s.charAt(s.length()-1);
                System.out.print(a);
                System.out.print(s.length()-2);
                System.out.println(b);
            }
        }

    }
}
