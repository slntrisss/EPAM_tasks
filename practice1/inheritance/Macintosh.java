package practice1.firstTask;

public class Macintosh extends Apple{
    private int camera;
    private int memory;
    private boolean hasTouchID;
    private boolean hasTouchScreen;

    public Macintosh() {
    }

    public Macintosh(int cost, String processor, String color,
                     int battery, String charger, String IMEICode,
                     int warranty, int camera, int memory,
                     boolean hasTouchID, boolean hasTouchScreen) {
        super(cost, processor, color, battery, charger, IMEICode, warranty);
        this.camera = camera;
        this.memory = memory;
        this.hasTouchID = hasTouchID;
        this.hasTouchScreen = hasTouchScreen;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public boolean isHasTouchID() {
        return hasTouchID;
    }

    public void setHasTouchID(boolean hasTouchID) {
        this.hasTouchID = hasTouchID;
    }

    public boolean isHasTouchScreen() {
        return hasTouchScreen;
    }

    public void setHasTouchScreen(boolean hasTouchScreen) {
        this.hasTouchScreen = hasTouchScreen;
    }
}
