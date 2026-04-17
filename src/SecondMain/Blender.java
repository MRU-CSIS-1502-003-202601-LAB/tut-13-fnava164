package SecondMain;

public class Blender extends Corded {
    private String speed;

    public Blender(String model) {
        super(model, "A");
        this.speed = "off";

    }

    public void turnOn() {
        if (isPluggedIn() == false || speed.equals("off")) {
            System.out.printf("the blender runs at %s speed %n", speed);
        }

    }

    public void turnOff() {
        System.out.println("turning off...");

    }

    public int powerUsed() {
        System.out.print("power used method called");
        return 10;
    }

    public void setSpeed(String newSpeed) {
        this.speed = newSpeed;
        System.out.printf("blender speed is: %s\n", speed);
    }
}