import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter your birth year...");
        int birthYear = scanner.nextInt();

        
        System.out.println("Please enter your birth month...");
        int birthMonth = scanner.nextInt();

        System.out.println("Please enter your birth day...");
        int birthDay = scanner.nextInt();

        
        
        Calendar today = Calendar.getInstance();
        Calendar birthDateCalendar = Calendar.getInstance();
        birthDateCalendar.set(birthYear, birthMonth, birthDay);


        int age = today.get(Calendar.YEAR) - birthDateCalendar.get(Calendar.YEAR);

        System.out.println("Your age is: " + age);
        scanner.close();

    }
}
