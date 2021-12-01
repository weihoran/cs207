package summation;

public class SumWithDoubleAccumulator extends Algorithm {
    @Override
    public double run(float[] input) {
        double accumulator = 0;
        for (float x :
                input) {
            accumulator += x;
        }
        return accumulator;
    }

    public SumWithDoubleAccumulator() {
        name = "DoubleAcc";
    }
}
