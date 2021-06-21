package exceptionhandling;

class MyException extends Exception{
    String msg = "";

    public MyException(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Custom Exception: " + msg;
    }
}
public class CustomeException {
    public static void main(String[] args) {
        try {
            throw new MyException("Custome exception testing");
        }catch (MyException e){
            System.out.println(e);
        }
    }
}
