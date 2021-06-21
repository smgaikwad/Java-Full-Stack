package circulatlist;

public class CircularList {
    public Node head;

    public CircularList(){
        head = null;
    }

    public void add(int data){
        Node newNode;

        if (head == null){
            newNode = new Node(data);
            head = newNode;
            newNode.next = head;
            System.out.println(data + " added successfully.....");
        }
        else {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;

            newNode = new Node(data);
            temp.next = newNode;
            newNode.next = head;
            System.out.println(data + " added successfully.....");
        }
    }

    public void delete(int data){
        if (head == null)
            System.out.println("List is empty.....");
        else if (head.data == data && head.next == head){
            head = null;
            System.out.println(data + " deleted successfully...");
        }
        else if (head.data == data && head.next != head){
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;

            head = head.next;
            temp.next = head;
            System.out.println(data + " deleted successfully...");
        }
        else
        {
            Node temp = head;
            while (temp.next.data != data && temp.next != head){
                temp = temp.next;
            }
            if (temp.next.data != data) System.out.println(data + " not present in list..");
            else {
                temp.next = temp.next.next;
                System.out.println(data + " deleted successfully....");
            }
        }
    }
    public void show(){
        if (head == null){
            System.out.println("List is empty....");
        }
        else
        {
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            while (temp.next != head.next);
        }
    }

}
