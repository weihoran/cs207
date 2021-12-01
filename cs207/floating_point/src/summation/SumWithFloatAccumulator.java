package summation;

public class SumWithFloatAccumulator extends Algorithm {
    @Override
    public double run(float[] input) {
        float accumulator = 0;
        for (float x :
                input) {
            accumulator += x;
        }
        return accumulator;
    }

    public SumWithFloatAccumulator() {
        name = "FloatAcc";
    }
}
