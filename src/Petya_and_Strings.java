import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();
        String a = x.toLowerCase();
        String b = y.toLowerCase();
        int r = 0;
        for (int i = 0; i < a.length() && i < b.length(); i++) {
            int c1 = a.charAt(i);
            int c2 = b.charAt(i);
            if (c1 > c2) {
                r = 1;
                break;
            } else if (c1 < c2) {
                r = -1;
                break;
            }
        }
        if (r == 0) {
            if (a.length() > b.length()) {
                r = 1;
            } else if (a.length() < b.length()) {
                r = -1;
            }
        }
        System.out.print(r);
    }
}