public class SmartLight extends SmartDevice implements Adjustable {
    private int brightness;

    public SmartLight(String deviceName) {
        super(deviceName);
    }
    @Override
    public void turnOn() {
        super.turnOn();
    }
    @Override
    public void turnOff() {
        super.turnOff();
    }

    @Override
    public void setLevel(int level) {
        if (this.isOn == false) {
            System.out.println("Cannot set brightness. The light is off.");
        } else {
            this.brightness = level;
        }
    }
    @Override
    public void performSelfDiagnostic() {
        System.out.println("Performing self-diagnostic on SmartLight: " + deviceName);
        System.out.println("Status: " + (isOn ? "On" : "Off"));
        System.out.println("Brightness level: " + brightness);
    }

}
