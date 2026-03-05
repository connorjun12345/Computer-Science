import java.util.ArrayList;

public class CocoaRegister {

    public static final double TAX_RATE = 0.0875;

    private ArrayList<Sellable> items;
    private ArrayList<Integer> quantities;

    public CocoaRegister() {
        items = new ArrayList<>();
        quantities = new ArrayList<>();
    }

    public void addItem(Sellable item, int quantity) {
        if (item == null || quantity <= 0) {
            return;
        } else {
            items.add(item);
            quantities.add(quantity);
        }
        // TODO:
        // - if item is null OR quantity <= 0, do nothing
        // - otherwise, add item and quantity to the parallel ArrayLists
    }

    public double getSubtotal() {
        double subtotal = 0.0;
        for (int i = 0; i < items.size(); i++) {
            double price = items.get(i).getBasePrice();
            int quantity = quantities.get(i);
            subtotal = subtotal + price * quantity;
        }

        // TODO:
        // sum item.getBasePrice() * quantity for all line items
        // return rounded to 2 decimals using ChocolateBar.round2(...)
        return ChocolateBar.round2(subtotal);
    }

    public double getTax() {
        double subtotal = getSubtotal();
        double tax = subtotal * TAX_RATE;
        double roundedTax = ChocolateBar.round2(tax);
        // TODO:
        // tax = subtotal * TAX_RATE, rounded to 2 decimals
        return roundedTax;
    }

    public double getTotal() {
        double total = ChocolateBar.round2(getSubtotal() + getTax());

        // TODO:
        // total = subtotal + tax, rounded to 2 decimals
        return total;
    }

    public void printReceipt() {
        System.out.println("== COCOA CORNER ==");
        for (int i = 0; i < items.size(); i++) {
            Sellable currentItem = items.get(i);
            int quantity = quantities.get(i);
            double unit = currentItem.getBasePrice();
            double lineTotal = ChocolateBar.round2(unit * quantity);
            System.out.println((i + 1) + ". " + currentItem.getName() + " x" + quantity + " @ $"
                    + ChocolateBar.money(unit) + " = $" + ChocolateBar.money(lineTotal));
        }
        System.out.println("Subtotal: $" + ChocolateBar.money(getSubtotal()));
        System.out.println("Tax: $" + ChocolateBar.money(getTax()));
        System.out.println("Total: $" + ChocolateBar.money(getTotal()));

        // TODO: Print EXACTLY the required receipt format.
        //
        // Hints:
        // - Header line: "== COCOA CORNER =="
        // - For each line item i:
        // (i+1) + ". " + name + " x" + qty + " @ $" + unit + " = $" + lineTotal
        // - Use ChocolateBar.money(...) for all currency formatting
    }

}
