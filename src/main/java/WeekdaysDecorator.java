import java.util.Calendar;

public class WeekdaysDecorator extends SkipassDecorator{
    WeekdaysDecorator(Skipass skipassToBeDecorated) {
        super(skipassToBeDecorated);
    }

    @Override
    public boolean isActive(Calendar currentDate) {
        int dow = currentDate.get (Calendar.DAY_OF_WEEK);
        boolean isWeekday = ((dow >= Calendar.MONDAY) && (dow <= Calendar.FRIDAY));
        if(!(isWeekday)) return false;
        return super.isActive(currentDate);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", only valid on weekdays";
    }
}
