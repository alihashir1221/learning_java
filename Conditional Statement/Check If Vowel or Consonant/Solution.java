package Conditional Statement.Check If Vowel or Consonant;

public class Solution {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter an alphabet.");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        if (ch=='a' || ch=='e' || ch== 'i' || ch=='o' || ch=='u' || ch=='A' || ch== 'E' || ch== 'I' || ch=='O' || ch=='U'){
            System.out.println("It is a vowel.");
        } else {
            System.out.println("It is a consonant.");
        }

    }
}
