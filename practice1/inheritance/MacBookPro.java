package practice1.firstTask;

public class MacBookPro extends Macintosh{
    private int numberOfPorts;
    private String speakerType;
    private String keyboardType;

    public MacBookPro() {
    }

    public MacBookPro(int cost, String processor, String color,
                      int battery, String charger, String IMEICode,
                      int warranty, int camera, int memory, boolean hasTouchID,
                      boolean hasTouchScreen, int numberOfPorts,
                      String speakerType, String keyboardType) {
        super(cost, processor, color, battery, charger, IMEICode, warranty, camera, memory, hasTouchID, hasTouchScreen);
        this.numberOfPorts = numberOfPorts;
        this.speakerType = speakerType;
        this.keyboardType = keyboardType;
    }

    public int getNumberOfPorts() {
        return numberOfPorts;
    }

    public void setNumberOfPorts(int numberOfPorts) {
        this.numberOfPorts = numberOfPorts;
    }

    public String getSpeakerType() {
        return speakerType;
    }

    public void setSpeakerType(String speakerType) {
        this.speakerType = speakerType;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(String keyboardType) {
        this.keyboardType = keyboardType;
    }
}
