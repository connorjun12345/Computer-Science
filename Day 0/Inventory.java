public class Inventory {
    private String itemName;
    private int quantity;
    private int price; 

    public Inventory(String itemName, int quantity, int price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return ("Item: " + itemName + ", Quantity:" + quantity + ", Price:" + price);
    }

    public boolean equals(Inventory other) {
        if (this.itemName.equals(other.itemName) && this.quantity == other.quantity && this.price == other.price) {
            return true;
        } else {
            return false;
        }
    }

    public double raisePrice(double percentRaise) {
        int percent = (int) (Math.random() * 101);
        percentRaise = price + (percent * .100);
        return (int) percentRaise;


    }
}

