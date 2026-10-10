import java.util.Scanner;

public class ATheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextInt();
        long n = sc.nextInt();
        long a = sc.nextInt();

        System.out.print((long) Math.ceil((double) m / a) * (long) Math.ceil((double) n / a));
    }
}