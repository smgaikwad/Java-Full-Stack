package advancejava.iofundamentals;

//Java program to demonstrate creating a text file using FileOutputStream
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamDemo
{
    public static void main(String[] args) throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        FileOutputStream fout=new FileOutputStream("dog1.txt");

        BufferedOutputStream bout = new BufferedOutputStream(fout,1024);
        System.out.println("Enter text:");
        char ch;

        while((ch=(char)dis.read())!='@')
        {
            bout.write(ch);
        }


        bout.close();
    }
}
