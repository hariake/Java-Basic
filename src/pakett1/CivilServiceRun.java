package pakett1;

public class CivilServiceRun {
    public static void main(String[] args) {
        CivilService service = new CivilService();

        System.out.println("Days left: " + service.getDaysLeft());

        service.work();
        service.work();

        System.out.println("Days left: " + service.getDaysLeft());
    }
}