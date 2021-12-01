package summation;

public class SumWithFloatKahan extends Algorithm {
    /**
     * Adapted from pseudo-code provided at https://en.wikipedia.org/wiki/Kahan_summation_algorithm
     *
     * @param input the input to the algorithm
     * @return sum of the inputs
     */
    @Override
    public double run(float[] input) {
        float sum = 0;                 // Prepare the accumulator.
        float c = 0;                   // A running compensation for lost low-order bits.

        for (float x : input) {
            float y = x - c;                // c is zero the first time around.
            float t = sum + y;              // Alas, sum is big, y small, so low-order digits of y are lost.
            c = (t - sum) - y;              // (t - sum) cancels the high-order part of y;
            // subtracting y recovers negative (low part of y)
            sum = t;                        // Algebraically, c should always be zero
        }
        return sum;
    }

    public SumWithFloatKahan() {
        name = "Kahan";
    }
}
