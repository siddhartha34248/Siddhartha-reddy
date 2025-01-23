import java.util.*;
public class Demo027 {

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num <= 1) {
            System.out.println(num + " is not a valid number for prime check.");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a valid number for prime check.");
                    return;
                }
            }
            System.out.println(num + " is a valid number for prime check.");
        }
        sc.close();
    }
}
