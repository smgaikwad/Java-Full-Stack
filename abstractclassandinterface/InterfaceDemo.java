package abstractclassandinterface;

interface Readable{
    public String getReadableContent();
}

interface Writable{
    public String getWritableContent();
}

class Reader{
    public void read(Readable doc){
        System.out.println(doc.getReadableContent());
    }
}

class Writer{
    public void write(Writable doc){
        System.out.println(doc.getWritableContent());
    }
}

class Pdf implements Readable{

    String contents;

    Pdf(String contents){
        this.contents = contents;
    }

    public String getReadableContent(){
        return contents;
    }
}

class WordDocument implements Writable{
    String content;

    public WordDocument(String content){
        this.content = content;
    }

    @Override
    public String getWritableContent(){
        return content;
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Readable resultPdf = new Pdf("Result is declared ....");
        Writable marksDoc = new WordDocument("Marks are entered...");

        Reader reader = new Reader();
        Writer writer = new Writer();
        System.out.println();
        reader.read(resultPdf);
        writer.write(marksDoc);

    }
}
