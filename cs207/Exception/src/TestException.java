import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;


public class TestException {

    public static void main(String[] args) throws FileNotFoundException {


        //------------------Checked Exception-----------------------------------

        //IO Exception
        FileInputStream fis;
        //fis = new FileInputStream("B:/myfile.txt");



        try {
            fis = new FileInputStream("B:/myfile.txt");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("You are opening .....");
        }

        System.out.println("aaaaaaaaa");


        //------------------Runtime（unchecked） Exception--------------------------------------
        int num1 = 10;
        int num2 = 0;
        //Since I'm dividing an integer with 0, it should throw ArithmeticException

        try {
            int res = num1 / num2;
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("always run");
        }


        //-------------------Customized Exception---------------------------------
        try {
            checkNumbers(0);
        }
        catch (MyZeroNumberException e) {
            e.printStackTrace();
        }

        System.out.println("finally will always be excuted");



    }



    public static void checkNumbers(int num) throws MyZeroNumberException {
        if (num == 0)
            throw new MyZeroNumberException("encounter 0");
    }


}


