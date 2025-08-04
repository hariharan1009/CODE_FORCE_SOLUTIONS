import java.util.HashSet;
import java.util.Scanner;

public class Boy_or_Girl {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        HashSet<Character> s=new HashSet<>();
        for(char c:st.toCharArray()){
            s.add(c);
        }
        if(s.size()%2==0){
            System.out.print("CHAT WITH HER!");
        }
        else{
            System.out.print("IGNORE HIM!");
        }
    }
}
