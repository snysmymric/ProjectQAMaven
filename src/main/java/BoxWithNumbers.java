public class BoxWithNumbers<N extends Number> {
    private N[] array;

    @SafeVarargs
    public BoxWithNumbers(N...array) {
        this.array = array;
    }

    public N[] getArray() {
        return array;
    }

    public void setArray(N[] array) {
        this.array = array;
    }

    public double average() {
        double avg = 0.0;
        for (N number : array) {
            avg += number.doubleValue();
        }
        return avg / array.length;
    }

    public boolean compareAverage(BoxWithNumbers<?> another) {
        return Math.abs(this.average() - another.average()) < 0.0001;
    }
}