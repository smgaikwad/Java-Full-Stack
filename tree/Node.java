package tree;

public class Node {
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
    }

    Node(){

    }

    @Override
    public String toString() {
        return " " + data+ " ";

    }
}
