import java.util.Calendar;

class LiftsLimitDecorator extends SkipassDecorator {
    private int liftsLimit;

    LiftsLimitDecorator (Skipass skipassToBeDecorated, int liftsLimit) {
        super(skipassToBeDecorated);
        this.liftsLimit = liftsLimit;
    }

    @Override
    public boolean isActive(Calendar currentDate) {
        if(this.liftsLimit == 0){
            return false;
        }
        return super.isActive(currentDate);
    }

    @Override
    public void decreaseNumberOfLifts(){
        super.decreaseNumberOfLifts();
        this.liftsLimit -= 1;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", LiftsLimit = " + liftsLimit;
    }
}