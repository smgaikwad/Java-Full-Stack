package constructor;

public class Bank {
    String name;
    String branch;
    String ifsc_code;

    public Bank(){
        // default constructor
    }


    //parameterized constructor.......
    public Bank(String name, String branch, String ifsc_code){
        this.name = name;
        this.branch = branch;
        this.ifsc_code = ifsc_code;
    }

    public Bank(Bank other){
        this.name = other.name;
        this.branch = other.branch;
        this.ifsc_code = other.ifsc_code;
    }

}
