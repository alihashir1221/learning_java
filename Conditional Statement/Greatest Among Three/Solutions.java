package Conditional Statement.Greatest Among Three;

public class Solutions {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number");
        int num3 = sc.nextInt();
        if (num1>num2 && num1 > num3){
            System.out.println("Num1 is greater");
        } else if (num2>num3) {
            System.out.println("Num2 is greater");
        } else {
            System.out.println("Num3 is greater");
        }
    
    }
}