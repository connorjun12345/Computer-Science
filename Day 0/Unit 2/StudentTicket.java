import java.util.Date;

public class StudentTicket extends StandardTicket {
    private static final double STUDENT_DISCOUNT = 0.50;

    public StudentTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
    }

    public double getTotalPrice() {
        int tickets = super.getTicketCount();
        double tax = super.getTax();
        double price = super.getBasePrice();

        double beforeDisPrice = (tickets * price) + ((tickets * price) * tax);
        double totalPrice = beforeDisPrice - (beforeDisPrice * STUDENT_DISCOUNT);
        return totalPrice;
    }

    @Override
    public void printTicketType() {
        System.out.println("Ticket Type: Student (Must Show ID)");
    }

}