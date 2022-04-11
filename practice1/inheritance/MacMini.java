package practice1.firstTask;

public class MacMini extends Macintosh{
    private boolean canMove;
    private String display;
    private String mouseType;

    public MacMini() {
    }

    public MacMini(int cost, String processor, String color,
                   int battery, String charger, String IMEICode,
                   int warranty, int camera, int memory, boolean hasTouchID,
                   boolean hasTouchScreen, boolean canMove, String display,
                   String mouseType) {
        super(cost, processor, color, battery, charger, IMEICode, warranty, camera, memory, hasTouchID, hasTouchScreen);
        this.canMove = canMove;
        this.display = display;
        this.mouseType = mouseType;
    }

    public boolean isCanMove() {
        return canMove;
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getMouseType() {
        return mouseType;
    }

    public void setMouseType(String mouseType) {
        this.mouseType = mouseType;
    }
}
