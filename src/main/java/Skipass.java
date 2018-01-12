import java.util.Calendar;

public interface Skipass {
    public boolean isBlocked();

    public void block();

    public boolean isActive(Calendar currentDate);

    public void decreaseNumberOfLifts();

    public String getInfo();

    public int getID();
}
