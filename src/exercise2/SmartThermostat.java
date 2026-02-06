package exercise2;

public class SmartThermostat extends SmartDevice implements Adjustable {
    private int temperature;

    public SmartThermostat(String deviceName) {
        super(deviceName);
    }
    @Override
    public void turnOn() {
        System.out.println("HVAC System Starting...");
        super.turnOn();
    }
    
    @Override
    public void turnOff() {
        super.turnOff();
    }

    @Override
    public void setLevel(int level) {
        if (this.isOn == false) {
            System.out.println("Cannot set temperature. The thermostat is off.");
        } else if (level < 60 || level > 80) {
            System.out.println("Temperature must be between 60 and 80 degrees.");
        } else {
            this.temperature = level;
        }
    }

    @Override
    public void performSelfDiagnostic() {
        System.out.println("Performing self-diagnostic on SmartThermostat: " + deviceName);
        System.out.println("Status: " + (isOn ? "On" : "Off"));
        System.out.println("Temperature: " + temperature);
    }
}
