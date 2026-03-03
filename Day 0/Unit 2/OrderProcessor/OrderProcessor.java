public class OrderProcessor {

    // To decompose this program I first had to understand how it worked and what it
    // did. I then began checking which parts of the code I could break up into
    // different methods. Finally I made new methods and called them in the main
    // method.
    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {
        double subtotal = calculateSubtotal(items);
        String[] expensiveItemsTemp = new String[items.length];
        int premiumCount = 0;

        for (Item item : items) {
            String name = item.getName();
            double price = item.getPrice();

            // Check if expensive
            if (isExpensive(item)) {
                expensiveItemsTemp[premiumCount] = name;
                premiumCount += 1;
                System.out.println(name + " is a premium item at $" + price);
            } else {
                System.out.println(name + " is a regular item at $" + price);
            }

        }

        String[] expensiveItems = trimExpensive(expensiveItemsTemp, premiumCount);

        // Calculate tax and total
        double tax = calculateTax(taxRate, subtotal);
        double total = calculateTotal(tax, subtotal);
        printOrderSummary(subtotal, tax, total, premiumCount);
        return new OrderSummary(total, subtotal, tax, expensiveItems);
    }

    public static void printOrderSummary(double subtotal, double tax, double total, double premiumCount) {
        // I extracted this code and made a method for printing the order summary
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Number of premium items: " + premiumCount);

    }

    // I extracted this code and made a method for calculating the subtotal of the
    // order
    public static double calculateSubtotal(Item[] items) {
        double subtotal = 0.0;
        for (Item item : items) {
            double price = item.getPrice();
            int quantity = item.getQuantity();

            // Calculate item total
            double itemTotal = price * quantity;
            subtotal += itemTotal;
        }

        return subtotal;
    }

    // I extracted this code and made a method for checking if an item is expensive
    // (over 50$)
    public static boolean isExpensive(Item item) {
        if (item.getPrice() > 50) {
            return true;
        } else {
            return false;
        }
    }

    // I extracted this code and made a method for making a smaller array with only
    // the necessary amount of index to store "expensive items"
    public static String[] trimExpensive(String[] expensiveItemsTemp, int premiumCount) {
        // Trim premium items to exact size
        String[] expensiveItems = new String[premiumCount];
        for (int i = 0; i < premiumCount; i++) {
            expensiveItems[i] = expensiveItemsTemp[i];
        }
        return expensiveItems;
    }

    // I extracted this code and made a method for calculating the tax of the order
    public static double calculateTax(double taxRate, double subtotal) {
        if (subtotal <= 0) {
            return 0.0;
        }
        double tax = subtotal * taxRate;
        return tax;
    }

    // I extracted this code and made a method for calculating the total price of
    // the order
    public static double calculateTotal(double tax, double subtotal) {
        if (subtotal <= 0) {
            return 0.0;
        }
        double total = subtotal + tax;
        return total;
    }

}
