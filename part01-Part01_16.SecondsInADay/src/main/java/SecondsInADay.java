
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());
        int min = days * 24;
//        int x = min * 60;
//        int seconds = x * 60;
        int seconds = (min * 60) * 60;
        System.out.println(seconds);
    }
}
