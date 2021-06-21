package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[] args) {
        int arr[]=new int[2];

        // try with resources.......
        try(FileReader fr = new FileReader("dog.txt")){

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        // nested try block
        try {
            System.out.println("----------------------------------");
            try {
                int a = 10 / 0;
            }
            catch (ArithmeticException ae) {
                System.out.println("Cannot devide by zero.....");
            }
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException aiob)
        {
            System.out.println("Please check the size of array.....");

        }
        System.out.println("----------------------------------");
    }
}
