import java.util.Scanner;

public class Lab02_Problem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Upper limit: ");
        int n = sc.nextInt();

        System.out.print("Natural Numbers from 1 to " + n + " is ");

        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
        }

        sc.close();
    }
}
