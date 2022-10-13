public class Solutions {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of first side.");
    int num1 = sc.nextInt();
    System.out.println("Enter the length of second side.");
    int num2 = sc.nextInt();
    System.out.println("Enter the length of third side.");
    int num3 = sc.nextInt();
    if (num1==num2 && num2==num3){
        System.out.println("It is a equilateral triangle");
    } else if (num1==num2 || num2==num3 || num1==num3){
        System.out.println("It is an isosceles triangle");
    } else {
        System.out.println("It is a scalene triangle");
    }
}
}
