package advancejava.generics;

public class GenericsDemo {
    public static void main(String[] args) {
        CustomGenericClass<String> generics = new CustomGenericClass<>();
        generics.setValue("70");
        System.out.println(generics.getValue());

        CustomGenericClass<Integer> generics1 = new CustomGenericClass<>();
        generics1.setValue(700);
        System.out.println(generics1.getValue());
    }
}

class CustomGenericClass<P>{
    private P value;

    public P getValue(){
        return this.value;
    }

    public void setValue(P value){
        this.value = value;
    }
}