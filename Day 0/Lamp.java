public class Lamp {
    // 1 light bulb
    // on/off switch
    // electrical cord
    // white lamp shade
    // silver pole

    private int numOfBulbs; // = 1;
    private String body; // = "Silver";
    private String part; // = "cord";
    private String onOrOff; // = "power switch";
    private String color; // = "White lamp shade";
    private double heightFeet; // = 1.5;
    private int lampBrightness; 

    public Lamp() {
        numOfBulbs = 1;
        body = "silver";
        part = "chord";
        onOrOff = "power switch";
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

    
        public boolean equals(Lamp otherLamp) {
            if (numOfBulbs == otherLamp.numOfBulbs) {
               return true;
            }
            else{
                return false;
            } 
            // if(
            // this.numOfBulbs == otherLamp.numOfBulbs &&
            // this.body == otherLamp.body &&
            // this.part == otherLamp.part &&
            // this.color == otherLamp.color &&
            // )
        }
    
    public int getlampBrightness() {
        return this.lampBrightness;
    }

    public void setheightFeet(int heightFeet) {
        this.heightFeet = heightFeet;
    }



    public String toString() {
        return "This lamp has " + lampBrightness + " percent brightness " + 
        heightFeet + " feet tall " + body + " color " + part + " attatchment " +
         onOrOff + " part " + color + " color " + numOfBulbs + " bulbs ";
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
        onOrOff = "on";
        System.out.println("The lamp is now turned");
        System.out.println(onOrOff);
    }

    public void off() {
        onOrOff = "off";
        System.out.println("The lamp is now turned");
        System.out.println(onOrOff);
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