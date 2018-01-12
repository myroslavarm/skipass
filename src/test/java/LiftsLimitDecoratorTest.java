import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class LiftsLimitDecoratorTest {
    private Skipass skiPass;
    private int numberOfLifts;
    private Calendar currentDate =  new GregorianCalendar(2018, Calendar.JANUARY, 12);

    @Before
    public void initializationOfObject() {
        numberOfLifts = 50;
        skiPass = new WeekdaysDecorator(new LiftsLimitDecorator(new SimpleSkipass(27), numberOfLifts));
    }

    @Test
    public void testIsActive() throws Exception {
        assertEquals(true, skiPass.isActive(currentDate));
    }

    @Test
    public void testDecreaseNumberOfLifts() throws Exception {
        for(int i=0; i<numberOfLifts-1; i++){
            skiPass.decreaseNumberOfLifts();
        }
        assertEquals(true, skiPass.isActive(currentDate));
        assertEquals("This is your skipass, LiftsLimit = 1, only valid on weekdays", skiPass.getInfo());
        skiPass.decreaseNumberOfLifts();
        assertEquals(false, skiPass.isActive(currentDate));
    }

}