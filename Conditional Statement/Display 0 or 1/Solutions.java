package Conditional Statement.Display 0 or 1;

public class Solutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int m = sc.nextInt();
        if (m >= 0){
            System.out.println("0");
        } else {
            System.out.println("-1");
        }
    }
}