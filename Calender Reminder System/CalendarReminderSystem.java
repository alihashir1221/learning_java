import java.util.ArrayList;
import java.util.Scanner;

class Reminder{
    private String date;
    private String reminderText;
    public Reminder(String date, String remiderText){
        this.date = date;
        this.reminderText = reminderText;
    }
    public String getDate(){
        return date;
    }
    public String getRemiderText(){
        return reminderText;
    }
}

public class CalendarReminderSystem{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Calendar Reminder System");
        System.out.println("Select one option");
        System.out.println("");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("");
                break;
        
            default:
                break;
        }
    }
}