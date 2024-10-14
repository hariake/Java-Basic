package pakett1;

public class MilitaryServiceRun {
    public static void main(String[] args) {
        // Create a MilitaryService object with 300 days of service
        MilitaryService militaryService = new MilitaryService(300);

        // Check initial days left
        System.out.println("Days left: " + militaryService.getDaysLeft());  // Should print 300

        // Work for a few days
        militaryService.work();
        militaryService.work();

        // Check updated days left
        System.out.println("Days left: " + militaryService.getDaysLeft());  // Should print 298
    }
}