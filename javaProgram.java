
import java.util.Scanner;

public class javaProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();

        var firstLetter = firstName.charAt(0);
        var capFirstLetter = Character.toUpperCase(firstLetter);

        var lastLetter = lastName.charAt(0);
        var capLastLetter = Character.toUpperCase(lastLetter);

        System.out.println("Your name is: " + firstName.replace(firstLetter, capFirstLetter) + " " + lastName.replace(lastLetter, capLastLetter));
    }
}