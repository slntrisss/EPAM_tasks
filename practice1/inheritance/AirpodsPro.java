package practice1.firstTask;

public class AirpodsPro extends Airpods{
    private boolean isWaterResistant;
    private int numberOfEarTips;
    private boolean isSpatialAudioEnabled;

    public AirpodsPro() {
    }

    public AirpodsPro(int cost, String processor, String color,
                      int battery, String charger, String IMEICode,
                      int warranty, boolean hasSoundIsolation,
                      boolean hasEarPads, boolean hasWirelessCharger,
                      boolean isWaterResistant, int numberOfEarTips,
                      boolean isSpatialAudioEnabled) {
        super(cost, processor, color, battery, charger,
                IMEICode, warranty, hasSoundIsolation,
                hasEarPads, hasWirelessCharger);
        this.isWaterResistant = isWaterResistant;
        this.numberOfEarTips = numberOfEarTips;
        this.isSpatialAudioEnabled = isSpatialAudioEnabled;
    }

    public boolean isWaterResistant() {
        return isWaterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        isWaterResistant = waterResistant;
    }

    public int getNumberOfEarTips() {
        return numberOfEarTips;
    }

    public void setNumberOfEarTips(int numberOfEarTips) {
        this.numberOfEarTips = numberOfEarTips;
    }

    public boolean isSpatialAudioEnabled() {
        return isSpatialAudioEnabled;
    }

    public void setSpatialAudioEnabled(boolean spatialAudioEnabled) {
        isSpatialAudioEnabled = spatialAudioEnabled;
    }
}
