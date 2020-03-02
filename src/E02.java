import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int nubmer = Integer.parseInt(scan.nextLine());
            sum += nubmer;
            if (max < nubmer) {
                max = nubmer;
            }
        }
        if (sum - max == max) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", max);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sum - max - max));
        }
    }
}
