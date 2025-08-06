import java.util.Scanner;

public class Translation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String x="YES";
        if(a.length()!=b.length()){
            System.out.println("NO");
            return;
         }
        int j=b.length()-1;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(j)){
                x="NO";
            }
            j--;
        }
        System.out.println(x);
    }
}
