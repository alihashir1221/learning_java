import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CalendarReminderSystem {
    private static final Map<Date, String> reminders = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        // Schedule a task to check reminders every minute
        executorService.scheduleAtFixedRate(CalendarReminderSystem::checkReminders, 0, 1, TimeUnit.MINUTES);

        while (true) {
            System.out.print("Enter a date (yyyy-MM-dd HH:mm): ");
            String dateString = scanner.nextLine();

            if (dateString.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(dateString);
                System.out.print("Enter event name: ");
                String eventName = scanner.nextLine();
                reminders.put(date, eventName);
                System.out.println("Reminder set for " + date);
            } catch (ParseException e) {
                System.err.println("Invalid date format. Please use yyyy-MM-dd HH:mm.");
            }
        }

        executorService.shutdown();
    }

    private static void checkReminders() {
        Date now = new Date();
        for (Map.Entry<Date, String> entry : reminders.entrySet()) {
            Date reminderDate = entry.getKey();
            if (now.after(reminderDate)) {
                String eventName = entry.getValue();
                System.out.println("Reminder: " + eventName + " at " + reminderDate);
                // You can add additional logic here (e.g., send notifications, play sounds, etc.)
                reminders.remove(reminderDate);
            }
        }
    }
}
