import java.util.Scanner;

public class Lab02_Problem05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = scan.nextLine();
       char ch = input.charAt(0);
        
        

            
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                    System.out.println("Input letter is Vowel");
                } 
                else {
                    System.out.println("Input letter is Consonant");
                }

            } 
            else {
                System.out.println("Error: Input is not an alphabet.");
            }
        }

        
    }

