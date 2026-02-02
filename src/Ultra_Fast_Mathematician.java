import java.util.*;

public class Ultra_Fast_Mathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                sb.append("1");
            }
            else sb.append("0");
        }
        System.out.println(sb.toString());
    }
}
