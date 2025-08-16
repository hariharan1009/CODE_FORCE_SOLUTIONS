import java.util.HashSet;
import java.util.Scanner;

public class Beautiful_Year {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        while(true){
            a+=1;
            String b=Integer.toString(a);
            HashSet<Integer> s=new HashSet<>();
            for(int i: b.toCharArray()){
                s.add(i);
            }
            if(s.size()==4){
                break;
            }
        }
        System.out.println(a);
    }
}
