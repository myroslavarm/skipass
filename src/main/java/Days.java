public enum Days {
    ONE_DAY(1), TWO_DAY(2), FIVE_DAY(5), UNLIM(Integer.MAX_VALUE);

    private int numberOfDays;

    Days(int numberOfDays){
        this.numberOfDays = numberOfDays;
    }


    public int getNumberOfDays() {
        return numberOfDays;
    }
}
