import java.sql.SQLOutput;
import java.util.*;

public class Nearly_Lucky_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int c=0;
        while(n!=0){
            long dig=n%10;
            if(dig==4 || dig==7){
                c++;
            }
            n/=10;
        }
        String x="NO";
        String s = Integer.toString(c);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='7' || s.charAt(i)=='4'){
                x="YES";
            }
        }
        System.out.println(x);
    }
}
