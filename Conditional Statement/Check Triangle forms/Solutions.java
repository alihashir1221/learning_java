package Conditional Statement.Check Triangle forms;

public class Solutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first angle");
        int num1 = sc.nextInt();
        System.out.println("Enter the second angle");
        int num2 = sc.nextInt();
        System.out.println("Enter the third angle");
        int num3 = sc.nextInt();
        if (num1 + num2 + num3 == 180) {
            System.out.println("It is a triangle");
        } else {
            System.out.println("It is not a triangle.");
        }

    }    
}
