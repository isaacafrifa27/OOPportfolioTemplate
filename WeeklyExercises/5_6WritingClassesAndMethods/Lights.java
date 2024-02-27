class Bulb {
    private boolean isOn;

    public Bulb() {
        isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Bulb is now turned on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Bulb is now turned off.");
    }

    public boolean isOn() {
        return isOn;
    }
}

public class Lights {
    public static void main(String[] args) {
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();

        System.out.println("Initial State:");
        displayBulbState(bulb1, 1);
        displayBulbState(bulb2, 2);

        bulb1.turnOn();
        bulb2.turnOn();

        System.out.println("\nUpdated State:");
        displayBulbState(bulb1, 1);
        displayBulbState(bulb2, 2);

        bulb1.turnOff();
        bulb2.turnOff();

        System.out.println("\nFinal State:");
        displayBulbState(bulb1, 1);
        displayBulbState(bulb2, 2);
    }

    private static void displayBulbState(Bulb bulb, int bulbNumber) {
        System.out.println("Bulb " + bulbNumber + " is " + (bulb.isOn() ? "on" : "off"));
    }
}
