import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[][] m=new int[5][5];
       int r=-1,c=-1;
       for(int i=0;i<5;i++) {
           for (int j = 0; j < 5; j++) {
               m[i][j] = sc.nextInt();
               if (m[i][j] == 1) {
                   c = i;
                   r = j;
               }
           }
       }
           int x=Math.abs(r-2)+Math.abs(c-2);
           System.out.println(x);

    }
}