public class PrisonerTest {
    private static int prisonerCount = 0;
    private final int bookingNumber;

    public PrisonerTest() {
        prisonerCount++;
        bookingNumber = prisonerCount;
    }

    public void display() {
        System.out.println("Booking Number: " + bookingNumber);
        System.out.println("Prisoner Count: " + prisonerCount);
    }

    public static void main(String[] args) {
        PrisonerTest prisoner1 = new PrisonerTest();
        PrisonerTest prisoner2 = new PrisonerTest();
        PrisonerTest prisoner3 = new PrisonerTest();

        System.out.println("Prisoner 1:");
        prisoner1.display();
        System.out.println();

        System.out.println("Prisoner 2:");
        prisoner2.display();
        System.out.println();

        System.out.println("Prisoner 3:");
        prisoner3.display();
        System.out.println();
    }
}