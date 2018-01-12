import java.util.Calendar;

public abstract class SkipassDecorator implements Skipass{
    Skipass skipassToBeDecorated;

    SkipassDecorator(Skipass skipassToBeDecorated){
        this.skipassToBeDecorated = skipassToBeDecorated;
    }

    public boolean isActive(Calendar currentDate) {
        return skipassToBeDecorated.isActive(currentDate); //Delegation
    }

    public boolean isBlocked(){
        return skipassToBeDecorated.isBlocked();
    }

    public void block(){
        skipassToBeDecorated.block();
    }

    public void decreaseNumberOfLifts(){
        skipassToBeDecorated.decreaseNumberOfLifts();
    }

    public String getInfo(){
        return skipassToBeDecorated.getInfo();
    }

    public int getID() {
        return skipassToBeDecorated.getID();
    }
}
