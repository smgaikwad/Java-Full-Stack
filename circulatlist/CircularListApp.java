package circulatlist;

public class CircularListApp {
    public static void main(String[] args) {
        System.out.println("--------- Circular Linked List ----------");
        CircularList list = new CircularList();
        list.add(10);
        list.add(20);
        list.add(30);

        list.show();
        System.out.println();

        list.delete(10);

        list.show();
        System.out.println();
    }
}
