package advancejava.iofundamentals;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("dog1.txt");

        for (int i = 0; i < 10; i++) {
            writer.println("Line: " + i);
        }

        writer.close();
    }
}
