// solutions for negative or positive number
import java.util.*;
       class HelloWorld {
            public static void main(String[] args) {
                try (Scanner sc = new Scanner(System.in)) {
                    int number = sc.nextInt();
                    if (number >= 0) {
                        System.out.println("Positive");
                    }  else {
                        System.out.println("Invalid");
                    }
                }
            }
        }