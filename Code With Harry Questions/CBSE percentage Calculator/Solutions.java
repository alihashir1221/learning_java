//package Code With Harry Questions.CBSE percentage Calculator;

public class Solutions {
    public static void main(String[] args) {
        double sum, percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Maths Marks: ");
        double maths = sc.nextInt();
        System.out.println("Enter Physics Marks: ");
        double physics = sc.nextInt();
        System.out.println("Enter Chemistry Marks: ");
        double chemistry = sc.nextInt();
        System.out.println("Enter English marks: ");
        double english = sc.nextInt();
        System.out.println("Enter Computer Marks: ");
        double computer = sc.nextInt();
        sum = maths + physics + chemistry + english + computer;
        percentage = (sum / 500) * 100;
        System.out.println("Your percentage is : " + percentage);
    }
}
