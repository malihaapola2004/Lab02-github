import java.util.Scanner;
public class Lab02_Problem10{
public static void main (String[]args){
Scanner sc= new Scanner(System.in);

System.out.print("Enter a string");
String str = sc.nextLine();
if(str.length()<2){
    System.out.println("The string must contain at least 2 characters");
}
else{
   String start = str.substring(0, str.length() - 2); // OK
char secondLast = str.charAt(str.length() - 2);   
char last = str.charAt(str.length() - 1);          
String swapped = start + last + secondLast;        
System.out.println("String after swapping last two characters: " + swapped);
}

sc.close();


}







    
}