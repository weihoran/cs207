package summation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * An experiment consists of one or more algorithms to compare,
 * a range of input sizes,
 * and a reference algorithm to compare against.
 */
public class Experiment {

    List<Algorithm> algorithms;
    List<Integer> inputsizes;
    Algorithm reference;


    public Experiment(Algorithm reference) {
        algorithms = new ArrayList<>();
        inputsizes = new ArrayList<>();
        this.reference = reference;
    }

    public void addAlgorithm(Algorithm a) {
        algorithms.add(a);
    }

    public void addInputSize(int i) {
        inputsizes.add(i);
    }

    public void runExperiment() {

        //make random number generator
        Random rand = new Random();

        //write the header for the output table
        System.out.printf("%10s", "N");
        for (Algorithm a : algorithms) {

            System.out.printf(" %26s", a.name);

        }
        System.out.println();

        //write the subheaders for the output table
        System.out.printf("%10s", "");
        for (Algorithm a : algorithms) {

            System.out.printf(" %15s", "error");
            System.out.printf("  %11s", "time");

        }

        System.out.println();

        //run experiment for each input size and algorithm.
        //output the result after each loop
        for (int inputsize : inputsizes) {
            //generate the input array of numbers

            float[] input = new float[inputsize];
            for (int i = 0; i < inputsize; i++) {
                input[i] = (float) Math.pow(10, -6 + rand.nextDouble() * 6);
            }

            double ref = reference.run(input);

            System.out.printf("%10d", inputsize);

            for (Algorithm a : algorithms) {
                long startTime = System.currentTimeMillis();
                double result = a.run(input);
                long endTime = System.currentTimeMillis();

                System.out.printf(" %20.8f", (ref - result) / ref);
                System.out.printf("  ~%3dms", endTime - startTime);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //setup experiment with our reference algorithm specified
        Algorithm ref = new SumWithDoubleAccumulator();
        Experiment experiment = new Experiment(ref);

        //set input sizes to run
        int start = 10000;
        for (int i = 0; i < 8; i++) {
            experiment.addInputSize(start);
            start *= 2;
        }
        //add the algorithms to compare
        experiment.addAlgorithm(new SumWithFloatAccumulator());
        experiment.addAlgorithm(new SumWithFloatAccumulatorSorted());
        experiment.addAlgorithm(new SumWithFloatKahan());
        //run our experiment
        experiment.runExperiment();
    }
}
