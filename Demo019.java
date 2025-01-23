import java.util.Scanner;

public class Demo019 {
   
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.err.println("Enter a number: ");
            int n = sc.nextInt();
             
            int first = 0, second = 1;
    
            System.out.println("Fibonacci Series up to " + n + " terms:");
    
            
            for (int i = 1; i <= n; ++i) {
                System.out.print(first + " ");
    
                
                int nextTerm = first + second;
                first = second;
                second = nextTerm;
            }
        }
    }