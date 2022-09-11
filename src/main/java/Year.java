public class Year {

    private final Integer year;

    public Year(Integer year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        return isDivisibleBy(4) && !(isDivisibleBy(100) &&  notDivisibleBy(400));
    }

    private boolean isDivisibleBy(Integer number) {
        return year % number == 0;
    }

    private boolean notDivisibleBy(Integer number) {
        return year % number != 0;
    }

}
