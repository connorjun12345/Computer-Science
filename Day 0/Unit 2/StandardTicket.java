import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class StandardTicket extends Ticket {

    public StandardTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
    }

    public double getTotalPrice() {
        int tickets = super.getTicketCount();
        double tax = super.getTax();
        double price = super.getBasePrice();

        double totalPrice = (tickets * price) + ((tickets * price) * tax);
        return totalPrice;
    }

    @Override
    public void printTicketType() {
        System.out.println("Ticket Type: Standard");
    }

    @Override
    public void printPrice() {
        BigDecimal decimalFormatter = new BigDecimal(getTotalPrice()).setScale(2, RoundingMode.HALF_UP);
        // rounds totalPrice to 2 decimal places, will be 1 decimal place if last digit
        // is 0 (i.e. 7.50 -> 7.5)
        System.out.println("Ticket Price: $" + decimalFormatter.doubleValue()); // prints the price
    }

    @Override
    public void printCancellationPolicy() {
        super.printCancellationPolicy();
        System.out.println("Can be canceled within 24 hours before the event. Cancellation fee applies.");

    }

    @Override
    public void printTicketDetails() {
        super.printTicketDetails();
        printTicketType();
        printPrice();
        printCancellationPolicy();
    }

}