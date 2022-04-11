package practice1.firstTask;

public class IPhone extends Apple{
    private String operationSystem;
    private int memory;
    private int camera;

    public IPhone() {
    }

    public IPhone(int cost, String processor, String color,
                  int battery, String charger, String IMEICode,
                  int warranty, String operationSystem, int memory, int camera) {
        super(cost, processor, color, battery, charger, IMEICode, warranty);
        this.operationSystem = operationSystem;
        this.memory = memory;
        this.camera = camera;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
}
