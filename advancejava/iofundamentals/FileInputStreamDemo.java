package advancejava.iofundamentals;

import java.io.FileInputStream;
import java.io.IOException;
public class FileInputStreamDemo
{
    public static void main(String args[]) throws IOException
    {
        FileInputStream fin= new FileInputStream("dog1.txt");
        System.out.println("remaining bytes:"+fin.available());

        fin.skip(4);
        System.out.println("File Contents :");

        int ch;
        while((ch=fin.read())!=-1)
            System.out.print((char)ch);

        System.out.println("\nreaining bytes: "+ fin.available());
        fin.close();
    }
}