package Conditional Statement.Leap Year or Not;

public class Solutions {
    import java.util.*;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
            System.out.println("Specified year is a leap year");
    }else{
            System.out.println("Specified year is not a leap year");
    }
    }
}
