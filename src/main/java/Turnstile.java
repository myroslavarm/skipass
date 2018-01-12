import java.util.Calendar;

public class Turnstile {
    private SkipassSystem skiSys;

    Turnstile(SkipassSystem skiSys){
        this.skiSys = skiSys;
    }

    public boolean permitPass(Skipass skipass, Calendar currentDate){
        return skiSys.permitPass(skipass, currentDate);
    }
}
