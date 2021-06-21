package doublylinkedlist;

import java.util.Scanner;

public class DoublyListDemoApp {

    public static Node insert(Node head, int data){
        if (head == null){
            head = new Node(data);
            System.out.println(data + " inserted successfully..");
        }
        else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            Node newNode = new Node(data);
            newNode.prev = temp;
            temp.next = newNode;
            System.out.println(data + " inserted successfully..");
        }
        return head;
    }

    private static Node delete(Node head, int data) {

        if (head == null) {
            System.out.println("list is empty..");
        }
        else if (head.next == null && head.prev == null) {
            if (head.data != data)
                System.out.println(data + " is not present in list...");
            else{
                head = null;
                System.out.println(data + " deleted successfully...");
            }
        }
        else if (head.data == data && head.next !=null){
            head = head.next;
            head.prev = null;
            System.out.println(data + " deleted successfully...");
        }
        else {
            Node temp = head;
            while (temp.data != data && temp.next != null)
                temp = temp.next;

            if (temp.data != data) System.out.println(data + " is not present in list...");
            else {
                if (temp.next == null){
                    temp.prev.next = null;
                    System.out.println(data + " deleted successfully...");
                }
                else {
                   temp.prev.next = temp.next;
                   temp.next.prev = temp.prev;
                   System.out.println(data + " deleted successfully...");
                }
            }
        }
        return head;
    }

    public static void search(Node head, int data){
        if (head == null){
            System.out.println("list is empty......");
        }
        else {
            int loc = 1;
            while (head.data != data && head.next != null){
                loc++;
                head = head.next;
            }
            if (head.data == data)
                System.out.println(data + " is present in list at location: " + loc);
             else
                System.out.println(data + " is not present in list...");
        }
    }

    public static void traverse(Node head){
        if (head == null)
            System.out.println("list is empty....");
        else {
            while (head != null){
                System.out.print("" + head.data + " ");
                head = head.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int data, ch;
        while (true) {

            System.out.println("--------- Doubly list Operations --------" +
                    "\n1. insert \n2. delete \n3. search \n4. traverse " +
                    "\nEnter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("enter data: ");
                    data = sc.nextInt();
                    head = insert(head, data);
                    break;

                case 2:
                    System.out.println("Enter data to be deleted: ");
                    data = sc.nextInt();
                    head = delete(head, data);
                    break;

                case 3:
                    System.out.println("Enter element to be search: ");
                    data = sc.nextInt();
                    search(head, data);
                    break;
                case 4:
                    traverse(head);
                    break;
                default:
                    System.out.println("please enter vali choice...");
            }

        }
    }
}
