
import java.util.Scanner;

public class AArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int minI = 0;
        int min = Integer.MAX_VALUE;
        int maxI = 0;
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            if (x > max) {
                max = x;
                maxI = i;
            }
            if (x <= min) {
                min = x;
                minI = i;
            }
        }
        int a = (m - minI - 1) + maxI;
        if (maxI > minI)
            a = a - 1;

        System.out.print(a);
        sc.close();
    }
}