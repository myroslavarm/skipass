import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class DaysLimitDecorator extends SkipassDecorator{
    private int daysLimit;
    private Calendar activationDate;

    DaysLimitDecorator(Skipass skipassToBeDecorated, int daysLimit) {
        super(skipassToBeDecorated);
        this.daysLimit = daysLimit;
    }

    @Override
    public boolean isActive(Calendar currentDate) {
        if (activationDate == null){
            activationDate = currentDate;
        }
        if(currentDate.getTimeInMillis() > ((activationDate.getTimeInMillis()) + TimeUnit.DAYS.toMillis(daysLimit)))
            return false;
        return super.isActive(currentDate);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", DaysLimit = " + daysLimit;
    }
}
