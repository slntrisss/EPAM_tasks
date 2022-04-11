package practice1.firstTask;

public class IPhone12Pro extends IPhone{
    private boolean has5GSupport;
    private int numberOfCameras;
    private boolean hasWirelessCharger;

    public IPhone12Pro() {
    }

    public IPhone12Pro(int cost, String processor, String color,
                       int battery, String charger, String IMEICode,
                       int warranty, String operationSystem, int memory,
                       int camera, boolean has5GSupport, int numberOfCameras,
                       boolean hasWirelessCharger) {
        super(cost, processor, color, battery, charger, IMEICode, warranty, operationSystem, memory, camera);
        this.has5GSupport = has5GSupport;
        this.numberOfCameras = numberOfCameras;
        this.hasWirelessCharger = hasWirelessCharger;
    }

    public boolean isHas5GSupport() {
        return has5GSupport;
    }

    public void setHas5GSupport(boolean has5GSupport) {
        this.has5GSupport = has5GSupport;
    }

    public int getNumberOfCameras() {
        return numberOfCameras;
    }

    public void setNumberOfCameras(int numberOfCameras) {
        this.numberOfCameras = numberOfCameras;
    }

    public boolean isHasWirelessCharger() {
        return hasWirelessCharger;
    }

    public void setHasWirelessCharger(boolean hasWirelessCharger) {
        this.hasWirelessCharger = hasWirelessCharger;
    }
}
