package practice1.firstTask;

public class Iphone7 extends IPhone{
    private boolean has4GSupport;
    private boolean hasTapticEngine;
    private String screenType;

    public Iphone7() {
    }

    public Iphone7(int cost, String processor, String color,
                   int battery, String charger, String IMEICode,
                   int warranty, String operationSystem, int memory,
                   int camera, boolean has4GSupport, boolean hasTapticEngine,
                   String screenType) {
        super(cost, processor, color, battery, charger, IMEICode, warranty, operationSystem, memory, camera);
        this.has4GSupport = has4GSupport;
        this.hasTapticEngine = hasTapticEngine;
        this.screenType = screenType;
    }

    public boolean isHas4GSupport() {
        return has4GSupport;
    }

    public void setHas4GSupport(boolean has4GSupport) {
        this.has4GSupport = has4GSupport;
    }

    public boolean isHasTapticEngine() {
        return hasTapticEngine;
    }

    public void setHasTapticEngine(boolean hasTapticEngine) {
        this.hasTapticEngine = hasTapticEngine;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }
}
