import java.util.Scanner;

public class Word {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0,cc=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 &&s.charAt(i)<=91){
                c++;
            }
            else if(s.charAt(i)>=95 &&s.charAt(i)<=122){
                cc++;
            }
        }
        if(c>cc){
            System.out.print(s.toUpperCase());
        }
        else{
            System.out.print(s.toLowerCase());
        }
    }
}
