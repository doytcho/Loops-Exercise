import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = Double.parseDouble(scan.nextLine());
        double sumOdd = 0;
        double sumEven = 0;
        double maxOdd = Integer.MIN_VALUE;
        double minOdd = Integer.MAX_VALUE;
        double maxEven = Integer.MIN_VALUE;
        double minEven = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            double nubmer = Double.parseDouble(scan.nextLine());
            if (i % 2 == 0) {
                sumEven += nubmer;
                if (nubmer > maxEven) {
                    maxEven = nubmer;
                }
                if (nubmer < minEven) {
                    minEven = nubmer;
                }
            } else {
                sumOdd += nubmer;
                if (nubmer > maxOdd) {
                    maxOdd = nubmer;
                }
                if (nubmer < minOdd) {
                    minOdd = nubmer;
                }
            }
        }
        System.out.printf("OddSum=%.2f,%n", sumOdd);
        if (n == 0) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n", minOdd);
        }
        if (n == 0) {
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax=%.2f,%n", maxOdd);
        }
        System.out.printf("EvenSum=%.2f,%n", sumEven);
        if (n <= 1) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin=%.2f,%n", minEven);
        }
        if (n <= 1) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%.2f%n", maxEven);
        }
    }
}
