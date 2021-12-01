package summation;

import java.util.Arrays;

public class SumWithFloatAccumulatorSorted extends SumWithFloatAccumulator {

    @Override
    public double run(float[] input) {

        Arrays.sort(input);
        return super.run(input);
    }

    public SumWithFloatAccumulatorSorted() {
        super();
        name += "Sorted";
    }
}
