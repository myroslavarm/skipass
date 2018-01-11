public enum Lifts {
    TEN(10), TWENTY(20), FIFTY(50), HUNDRED(100), UNLIM(Integer.MAX_VALUE);

    private int numberOfLifts;

    Lifts(int numberOfLifts){
        this.numberOfLifts = numberOfLifts;
    }
}
