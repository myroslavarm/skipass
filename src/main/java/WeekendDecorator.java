import java.util.Calendar;

public class WeekendDecorator extends SkipassDecorator{
    WeekendDecorator(Skipass skipassToBeDecorated) {
        super(skipassToBeDecorated);
    }

    @Override
    public boolean isActive(Calendar currentDate) {
        int dow = currentDate.get (Calendar.DAY_OF_WEEK);
        boolean isWeekend = ((dow == Calendar.SATURDAY) || (dow == Calendar.SUNDAY));
        if(!(isWeekend)) return false;
        return super.isActive(currentDate);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", only valid on weekends";
    }
}
