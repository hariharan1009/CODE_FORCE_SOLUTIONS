import java.util.Scanner;
import java.util.Stack;

public class sam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> sta= new Stack<>();
        String str=sc.nextLine();
        int n=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                n=str.charAt(i);
                //int sum=0;
                if(Character.isDigit(str.charAt(i+1))){
                    n=n*10+str.charAt(i);
                }


            }
        }
        System.out.print(n);


    }
}
