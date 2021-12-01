package calculation_example;

public class test {
    public static void main(String[] args) {
        IOperation add = new OperationAdd();
        CalculationClass context = new CalculationClass(add);

        System.out.println("10 + 5 = " + context.executeAlgorithm(10, 5));

        context.setCalculationAlgorithm(new OperationSubstract());

        //context = new calculation_example.CalculationClass(new calculation_example.OperationSubstract());
        System.out.println("10 - 5 = " + context.executeAlgorithm(10, 5));

        context = new CalculationClass(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeAlgorithm(10, 5));
    }
}


