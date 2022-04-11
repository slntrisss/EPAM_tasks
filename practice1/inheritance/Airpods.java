package practice1.firstTask;

public class Airpods extends Apple{
    private boolean hasSoundIsolation;
    private boolean hasEarPads;
    private boolean hasWirelessCharger;

    public Airpods() {
    }

    public Airpods(int cost, String processor, String color, int battery,
                   String charger, String IMEICode, int warranty,
                   boolean hasSoundIsolation, boolean hasEarPads,
                   boolean hasWirelessCharger) {
        super(cost, processor, color, battery, charger, IMEICode, warranty);
        this.hasSoundIsolation = hasSoundIsolation;
        this.hasEarPads = hasEarPads;
        this.hasWirelessCharger = hasWirelessCharger;
    }

    public boolean isHasSoundIsolation() {
        return hasSoundIsolation;
    }

    public void setHasSoundIsolation(boolean hasSoundIsolation) {
        this.hasSoundIsolation = hasSoundIsolation;
    }

    public boolean isHasEarPads() {
        return hasEarPads;
    }

    public void setHasEarPads(boolean hasEarPads) {
        this.hasEarPads = hasEarPads;
    }

    public boolean isHasWirelessCharger() {
        return hasWirelessCharger;
    }

    public void setHasWirelessCharger(boolean hasWirelessCharger) {
        this.hasWirelessCharger = hasWirelessCharger;
    }
}
