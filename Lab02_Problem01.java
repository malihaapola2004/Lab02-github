import java.util.Scanner;
import java.util.Random;

public class Lab02_Problem01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter string length: ");
        int length = sc.nextInt();

        
        char firstChar = (char) (rand.nextInt(26) + 'A');

        String result = "" + firstChar;

        
        for (int i = 1; i < length; i++) {
            char ch = (char) (rand.nextInt(26) + 'a');
            result = result + ch;
        }

        System.out.println("Random generated string : " + result);

        sc.close();
    }
}
