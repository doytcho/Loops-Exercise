import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number < 200) {
                p1++;
            } else if (number < 400) {
                p2++;
            } else if (number < 600) {
                p3++;
            } else if (number < 800) {
                p4++;
            } else if (number >= 800) {
                p5++;
            }
        }
        double sum = p1 + p2 + p3 + p4 + p5;
        p1 = p1 / sum;
        p2 = p2 / sum;
        p3 = p3 / sum;
        p4 = p4 / sum;
        p5 = p5 / sum;
        System.out.printf("%.2f%%%n", p1 * 100);
        System.out.printf("%.2f%%%n", p2 * 100);
        System.out.printf("%.2f%%%n", p3 * 100);
        System.out.printf("%.2f%%%n", p4 * 100);
        System.out.printf("%.2f%%%n", p5 * 100);
    }
}
