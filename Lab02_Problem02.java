import java.util.Scanner;

public class Lab02_Problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Input is an alphabet");
        } else {
            System.out.println("Input is not an alphabet");
        }

        sc.close();
    }
}
