import java.util.Scanner;

public class Demo020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for an input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the fizzBizz method and display the result
        System.out.println(fizzBizz(number));

        scanner.close();
    }
public static String fizzBizz(int num) {
        if (num % 3 == 0 && num % 5 == 0){
            return "FIZZBIZZ";
        } else if (num % 3 == 0) {
            return "FIZZ";
        } else if (num % 5 == 0) {
            return "BIZZ";
        } else {
            return String.valueOf(num);

        }
    }
}