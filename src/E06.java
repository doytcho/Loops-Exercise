import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabs = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < tabs; i++) {
            String tabName = scan.nextLine();
            if (tabName.equals("Facebook")) {
                salary -= 150;
            }
            if (tabName.equals("Instagram")) {
                salary -= 100;
            }
            if (tabName.equals("Reddit")) {
                salary -= 50;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
            }
        }
        if (salary > 0) {
            System.out.println(salary);
        }
    }
}
