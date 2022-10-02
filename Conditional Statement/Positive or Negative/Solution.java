// solutions for negative or positive number
import java.util.*;
//Write a Java program to get a number from the user and print whether it is positive or negative. Go to the editor

        //Test Data
       // Input number: 35
       // Expected Output :
       // Number is positive
       class HelloWorld {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int number = sc.nextInt();
                if (number >= 0) {
                    System.out.println("Positive");
                }  else {
                    System.out.println("Invalid");
                }
            }
        }