
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");
        String text = scanner.nextLine();
        System.out.println("Give an integer:");
        int x = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double d = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean s = Boolean.valueOf(scanner.nextLine());;
        
        System.out.println("You gave the string " +text);
        System.out.println("You gave the integer " +x);
        System.out.println("You gave the double " +d);
        System.out.println("You gave the boolean " +s);

    }
}
