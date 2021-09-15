import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestException {

    public static void main(String[] args){



        //------------------Checked Exception-----------------------------------

        //IO Exception
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("B:/myfile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("You are opening .....");
        }
        System.out.println("aaaaaaaaa");


        //------------------Runtime（unchecked） Exception--------------------------------------
        int num1=10;
        int num2=0;
        //Since I'm dividing an integer with 0, it should throw ArithmeticException
        try {
            int res = num1 / num2;
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        finally {

        }



        //-------------------Customized Exception---------------------------------
        try {
            checkNumbers(0);
        }
        catch (MultipleMyZeroNumberException e) {
            e.printStackTrace();
        }

        System.out.println("finally will always be excuted");









    }



    public static void checkNumbers(int num) throws MultipleMyZeroNumberException {
        if (num==0)
            throw new MultipleMyZeroNumberException("The number can't be zero");
    }


}


