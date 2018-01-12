import java.util.Calendar;

public class SimpleSkipass implements Skipass{
    private int id;
    private boolean blocked = false;

    SimpleSkipass(int id) {
        this.id = id;
    }

    public int getID() {
        return this.id;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void block() {
        blocked = true;
    }

    public boolean isActive(Calendar currentDate) {
        return !blocked;
    }

    public void decreaseNumberOfLifts() {

    }

    public String getInfo() {
        return "This is your skipass";
    }
}
