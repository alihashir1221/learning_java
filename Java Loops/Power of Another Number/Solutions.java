//package Java Loops.Power of Another Number;

public class Solutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base value: ");
        int base = sc.nextInt();
        System.out.println("Enter the power: ");
        int power = sc.nextInt();
        int result = 1;
        for (int i =1 ; i <= power; i++) {
            result *= base;
        }
        System.out.println( result);
    }
}
