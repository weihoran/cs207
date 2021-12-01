package calculation_example;

public class OperationAdd implements IOperation {
    @Override
    public int Operation(int num1, int num2) {
        return num1 + num2;
    }
}