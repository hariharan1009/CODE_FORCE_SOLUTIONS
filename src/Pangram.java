import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine().toLowerCase();
        HashSet<Character> a=new HashSet<>();
        for(char c:s.toCharArray()){
            a.add(c);
        }
        if(a.size()==26) System.out.println("YES");
        else System.out.println("NO");
    }
}
