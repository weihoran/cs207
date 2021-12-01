package summation;

/**
 * An algorithm consists of a run method to execute the algorithm and the name of the algorithm
 */
public abstract class Algorithm {

    /**
     * @param input the input to the algorithm
     * @return the result of running the algorithm on the given input array
     */
    public abstract double run(float[] input);

    public String name;


}
