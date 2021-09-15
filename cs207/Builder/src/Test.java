public class Test {

    public static void main(String[] args) {
        Builder builder = new ComputerBuilder();
        Director pcDirector = new Director(builder);
        Computer computer = pcDirector.construct("Intel", "Retina", "windows");
        System.out.println(computer.toString());
    }

}
