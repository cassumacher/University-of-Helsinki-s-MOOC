
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextInt());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextInt());
        int sum = first + second;
        
        System.out.println(first  + " + " + second + " = " + sum );

    }
}
