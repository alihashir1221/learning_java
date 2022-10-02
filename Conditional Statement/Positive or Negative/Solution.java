// solutions for negative or positive number
import java.util.*;
       class HelloWorld {
            // solutions for negative or positive number
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a number");
                int number = sc.nextInt();
                if (number > 0) {
                    System.out.println("Positive");
                } else {
                    System.out.println("Negative");
                }
            }
        }