public class LampTester {
    
    public static void main(String[] args) {
        System.out.println("Yo, whats up");
        

        Lamp colorfulLamp = new Lamp();
        colorfulLamp.shine();
        colorfulLamp.on();
        colorfulLamp.off();
        colorfulLamp.shatter();
        System.out.println(colorfulLamp.toString());

        Lamp lampTwo = new Lamp();
        if (colorfulLamp.equals(lampTwo)) {
            System.out.println("The two lamps are equal!");

        } 
        else{
            System.out.println("The two lamps are not equal");
        }
        
    }
}
