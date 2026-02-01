import java.util.HashSet;
import java.util.Scanner;

public class Is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        set.add(sc.nextInt());
        set.add(sc.nextInt());
        set.add(sc.nextInt());
        set.add(sc.nextInt());
        int needToBuy = 4 - set.size();
        System.out.println(needToBuy);
    }
}