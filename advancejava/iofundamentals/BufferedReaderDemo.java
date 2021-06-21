package advancejava.iofundamentals;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader myfileReader = new BufferedReader(new FileReader("dog1.txt"));


        int x = Integer.parseInt(br.readLine());
        //String line = myfileReader.readLine();

        char data[] = new char[100];
        myfileReader.read(data,2, 10);
        System.out.println(data);

        //System.out.println(line);

        while (myfileReader.readLine() != null)
            System.out.println(myfileReader.readLine());

    }
}
