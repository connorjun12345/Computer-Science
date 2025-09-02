public class Lamp {
    // 1 light bulb
    // on/off switch
    // electrical cord
    // white lamp shade
    // silver pole

    private int numOfBulbs; // = 1;
    private String body; // = "Silver";
    private String part; // = "cord";
    private String on_or_off; // = "power switch";
    private String color; // = "White lamp shade";
    private double heightFeet; // = 1.5;
    private int lampBrightness; 

    public Lamp() {
        numOfBulbs = 1;
        body = "silver";
        part = "chord";
        on_or_off = "power switch";
        color = "White lamp shade";
        heightFeet = 1.5;
        lampBrightness = 10;
    }

    public void replaceLight(int lampBrightness) {
        if (lampBrightness < 5) {
            System.out.println("The light bulb is too dim. Please replace!!");
        }
        else {
            System.out.println("No need to change the light bulb yet!!");
        }
    }


    public void dim() {
        lampBrightness = 20;
        System.out.println("The lamp is now on brightness level " + lampBrightness);
    }    

    public void shine() {
        color = "yellow";
        System.out.println("The lamp is now shining " + color);
    }    

    public void shatter() {
        System.out.println("The lamp fell and shattered!!!");
    }

    public void on() {
        on_or_off = "on";
        System.out.println("The lamp is now turned");
        System.out.println(on_or_off);
    }

    public void off() {
        on_or_off = "off";
        System.out.println("The lamp is now turned");
        System.out.println(on_or_off);
    }
    
    //illuminate
    // shine
    // break
    // fix
    //on
    //off
    public static void main() {
        
    }
}