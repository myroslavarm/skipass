import java.util.Calendar;

public class SkipassSystem {
    private int counter = 0;

    public Skipass newPass(Days numberOfDays, Lifts numberOfLifts, CardType cardType){
        Skipass skiPass = new SimpleSkipass(counter);
        counter += 1;

        if(!numberOfLifts.equals(Lifts.UNLIM)) {
            skiPass = new LiftsLimitDecorator(skiPass, numberOfLifts.getNumberOfLifts());
        }
        if (!numberOfDays.equals(Days.UNLIM)) {
            skiPass = new DaysLimitDecorator(skiPass, numberOfDays.getNumberOfDays());
        }

        if (cardType.equals(CardType.WEEKDAYS)) {
            skiPass = new WeekdaysDecorator(skiPass);
        }
        if (cardType.equals(CardType.WEEKEND)){
            skiPass = new WeekendDecorator(skiPass);
        }
        return skiPass;
    }

    public void block(Skipass skipass){
        skipass.block();
    }

    public boolean permitPass(Skipass skipass, Calendar currentDate){
        if(skipass.isActive(currentDate)){
            skipass.decreaseNumberOfLifts();
            return true;
        }
        else{
            return false;
        }
    }
}
