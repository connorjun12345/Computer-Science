import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class MemberTicket extends Ticket {
    private static final double MEMBER_DISCOUNT = 0.25;
    private double totalPrice;

    public MemberTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
        totalPrice = getTotalPrice();
    }

    public double getTotalPrice() {
        int tickets = super.getTicketCount();
        double tax = super.getTax();
        double price = super.getBasePrice();

        double beforeDisPrice = (tickets * price) + ((tickets * price) * tax);
        totalPrice = beforeDisPrice - (beforeDisPrice * MEMBER_DISCOUNT);
        return totalPrice;
    }

    public void printMemberBenefits() {
        System.out.println("Includes access to special discounts and complimentary refreshments.");
    }

    @Override
    public void printTicketType() {
        System.out.println("Ticket Type: Member");
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
        System.out.print("Can be canceled within 24 hours before the event. No Cancellation fee applies.");

    }

    public static double getMemberDiscount() {
        return MEMBER_DISCOUNT;
    }

    @Override
    public void printTicketDetails() {
        super.printTicketDetails();
        printTicketType();
        printPrice();
        printMemberBenefits();
        printCancellationPolicy();
    }

}