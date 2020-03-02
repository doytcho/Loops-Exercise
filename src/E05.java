import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = Integer.parseInt(scan.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number % 2 == 0) {
                p1++;
            }
            if (number % 3 == 0) {
                p2++;
            }
            if (number % 4 == 0) {
                p3++;
            }
        }
        double sum = p1 + p2 + p3;
        p1 = p1 / n;
        p2 = p2 / n;
        p3 = p3 / n;
        System.out.printf("%.2f%%%n", p1 * 100);
        System.out.printf("%.2f%%%n", p2 * 100);
        System.out.printf("%.2f%%%n", p3 * 100);
    }
}
