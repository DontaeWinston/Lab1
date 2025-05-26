public class Main {
    public static void main(String[] args) {
        // Motorcycle 1
        Motorcycle myMotorcycle1 = new Motorcycle(
                "Black", 19.5, Material.ALUMINUM, 20.0,
                "Twist Throttle", "Trigger Shift", "V Engine", "Aluminum", "Separate Dual Exhaust Pipes"
        );
        myMotorcycle1.setColor("Orange");
        myMotorcycle1.setSize(31.0);

        // Motorcycle 2
        Motorcycle myMotorcycle2 = new Motorcycle(
                "Yellow", 20.0, Material.TITANIUM, 22.0,
                "Twist Throttle", "Trigger Shift", "V Engine", "Aluminum", "Separate Dual Exhaust Pipes"
        );
        myMotorcycle2.setColor("Yellow");

        // Motorcycle 3
        Motorcycle myMotorcycle3 = new Motorcycle(
                "Blue", 22.0, Material.STEEL, 22.5,
                "Twist Throttle", "Trigger Shift", "V Engine", "Aluminum", "Separate Dual Exhaust Pipes"
        );

        // Output for Motorcycle 1
        System.out.println("Motorcycle 1:");
        System.out.println("Color: " + myMotorcycle1.getColor());
        System.out.println("Size: " + myMotorcycle1.getSize() + "\"");
        System.out.println("Frame Material: " + myMotorcycle1.getFrameMaterial());
        System.out.println("Wheel Size: " + myMotorcycle1.getWheelSize() + " inch");
        System.out.println("Throttle Type: " + myMotorcycle1.getThrottleType());
        System.out.println("Gear Shift Type: " + myMotorcycle1.getGearShiftType());
        System.out.println("Engine Type: " + myMotorcycle1.getEngineType());
        System.out.println("Fuel Tank Material: " + myMotorcycle1.getFuelTankMaterial());
        System.out.println("Exhaust Type: " + myMotorcycle1.getExhaustType());
        myMotorcycle1.start();
        myMotorcycle1.stop();

        // Output for Motorcycle 2
        System.out.println("\nMotorcycle 2:");
        System.out.println("Color: " + myMotorcycle2.getColor());
        System.out.println("Size: " + myMotorcycle2.getSize() + "\"");
        System.out.println("Frame Material: " + myMotorcycle2.getFrameMaterial());
        System.out.println("Wheel Size: " + myMotorcycle2.getWheelSize() + " inch");
        System.out.println("Throttle Type: " + myMotorcycle2.getThrottleType());
        System.out.println("Gear Shift Type: " + myMotorcycle2.getGearShiftType());
        System.out.println("Engine Type: " + myMotorcycle2.getEngineType());
        System.out.println("Fuel Tank Material: " + myMotorcycle2.getFuelTankMaterial());
        System.out.println("Exhaust Type: " + myMotorcycle2.getExhaustType());
        myMotorcycle2.start();
        myMotorcycle2.stop();

        // Output for Motorcycle 3
        System.out.println("\nMotorcycle 3:");
        System.out.println("Color: " + myMotorcycle3.getColor());
        System.out.println("Size: " + myMotorcycle3.getSize() + "\"");
        System.out.println("Frame Material: " + myMotorcycle3.getFrameMaterial());
        System.out.println("Wheel Size: " + myMotorcycle3.getWheelSize() + " inch");
        System.out.println("Throttle Type: " + myMotorcycle3.getThrottleType());
        System.out.println("Gear Shift Type: " + myMotorcycle3.getGearShiftType());
        System.out.println("Engine Type: " + myMotorcycle3.getEngineType());
        System.out.println("Fuel Tank Material: " + myMotorcycle3.getFuelTankMaterial());
        System.out.println("Exhaust Type: " + myMotorcycle3.getExhaustType());
        myMotorcycle3.start();
        myMotorcycle3.stop();
    }
}
