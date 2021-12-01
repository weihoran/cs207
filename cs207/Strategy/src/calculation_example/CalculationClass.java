package calculation_example;

public class CalculationClass {
    private IOperation calculationAlgorithm;

    public CalculationClass(IOperation calculationAlgorithm){
        this.calculationAlgorithm = calculationAlgorithm;
    }


    public int executeAlgorithm(int num1, int num2){
        return calculationAlgorithm.Operation(num1, num2);
    }




    public void setCalculationAlgorithm(IOperation calculationAlgorithm) {
        this.calculationAlgorithm = calculationAlgorithm;
    }
}


