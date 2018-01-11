public class SkipassSystem {
    public Skipass newPass(Days numberOfDays, Lifts numberOfLifts){
        Skipass skiPass;

        if(numberOfLifts.equals(Lifts.UNLIM)) {
            skiPass = new SkipassByDays(numberOfDays);
        }
        else if (numberOfDays.equals(Days.UNLIM)) {
            skiPass = new SkipassByLifts(numberOfLifts);
        }

        //return new Skipass(skiPass);
        return null;
    }
}
