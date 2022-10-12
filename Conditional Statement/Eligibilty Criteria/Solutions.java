package Conditional Statement.Eligibilty Criteria;

public class Solutions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks of Mathematics.");
        int math = sc.nextInt();
        System.out.println("Enter your marks of Physics.");
        int physics = sc.nextInt();
        System.out.println("Enter your marks of Chemistry.");
        int chemistry = sc.nextInt();
        if (math>=65 && physics>=55 && chemistry>=55){
            System.out.println("The student is eligible");
        } else if ( math + physics + chemistry >= 190) {
            System.out.println("The student is eligible");
        } else if (math + physics >= 140 ){
            System.out.println("The student is eligible");
        } else {
            System.out.println("The student is not eligible");
        }
    }
    
}
