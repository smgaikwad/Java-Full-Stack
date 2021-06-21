package advancejava.iofundamentals;
import java.io.*;
public class BufferedWriterDemo
{
    public static void main(String[] args)
    {
        FileWriter geek_file;
        try
        {
            geek_file = new FileWriter("dog1.txt",true);
            BufferedWriter write = new BufferedWriter(geek_file);
            System.out.println("Buffered Writer start writing ");

            write.write("I am sooraj..");
            write.write(49);

            write.close();
            System.out.println("Written successfully");
        }
        catch (IOException excpt)
        {
            excpt.printStackTrace();
        }

    }
}
