import java.util.Scanner;

public class Word_Capitalization {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(i==0 && s.charAt(i)>=97 && s.charAt(i)<=122){
                sb.append((char) (s.charAt(0) - 32));
            }
            else{
                sb.append(s.charAt(i));
            }

        }
        System.out.print(sb);
    }
}
