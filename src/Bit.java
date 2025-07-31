import java.util.Scanner;

public class Bit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        while(n-->=0){
            String s=sc.nextLine();
            if(s.contains("++")){
                x++;
            }
            else if(s.contains("--")){
                x--;
            }
        }
        System.out.print(x);
    }
}
