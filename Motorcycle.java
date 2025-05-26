/**
 * Represents a Motorcycle with multiple components including frame, wheels, engine, and more.
 * Author: Dontae Winston
 * Date: 2025-05-23
 */
public class Motorcycle {    
    private String color;
    private double size;
    private Frame frame;
    private Wheel[] wheels;
    private throttle throttle;
    private gearshift gearShift;
    private Engine engine;
    private fueltank fuelTank;
    private exhaust exhaust;

    public Motorcycle(String color, double size, Material frameMaterial, double wheelSize,
                      String throttleType, String gearShiftType, String engineType,
                      String fuelTankMaterial, String exhaustType) {
        this.color = color;
        this.size = size;
        this.frame = new Frame(frameMaterial);
        this.wheels = new Wheel[] {
                new Wheel(wheelSize),
                new Wheel(wheelSize)
        };
        this.throttle = new throttle(throttleType);
        this.gearShift = new gearshift(gearShiftType);
        this.engine = new Engine(engineType);
        this.fuelTank = new fueltank(fuelTankMaterial);
        this.exhaust = new exhaust(exhaustType);
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getSize() { return size; }
    public void setSize(double size) { this.size = size; }

    public Material getFrameMaterial() { return frame.getMaterial(); }
    public double getWheelSize() { return wheels[0].getSize(); }

    public String getThrottleType() { return throttle.getType(); }
    public String getGearShiftType() { return gearShift.getType(); }
    public String getEngineType() { return engine.getType(); }
    public String getFuelTankMaterial() { return fuelTank.getMaterial(); }
    public String getExhaustType() { return exhaust.getType(); }

    public void start() {
        System.out.println("Motorcycle started!");
    }

    public void stop() {
        System.out.println("Motorcycle stopped.");
    }
}
