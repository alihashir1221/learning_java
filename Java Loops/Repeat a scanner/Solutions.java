//package Java Loops.Repeat a scanner;

public class Solutions {
    public static void main(String[] args) {

        int choice;
        do {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number ");
        int b = sc.nextInt();
        int sum = a + b;
            System.out.println(" The sum is " + sum );
            System.out.println("Dou want to continue: Y / N");
            choice = sc.next().charAt(0);
            System.out.println();
        } while(choice =='Y'|| choice =='y');
    }
}
