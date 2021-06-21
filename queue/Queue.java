package queue;

public class Queue {
    private static final int max = 10;
    int front, rear;
    int arr[] = new int[max];

    public Queue() {
        this.front = -1;
        this.rear = -1;
    }

    public boolean isEmpty(){
        if (front == -1 && rear == -1)
            return true;
        return false;
    }

    public boolean isFull(){
        if (rear == max-1)
            return true;
        return false;
    }

    public void enQueue(int data){
        if (isFull()){
            System.out.println("queue is Full..");
        }
        else if (isEmpty()){
            front = rear = 0;
            arr[rear] = data;
            System.out.println(data + " added successfully...");
        }
        else {
            rear = rear+1;
            arr[rear] = data;
            System.out.println(data + " added successfully...");
        }
    }

    public void deQueue(){
        if (isEmpty() || front > rear){
            System.out.println("Queue is Empty..");
        }
        else if (front==rear)
        {
            front = rear = -1;
        }
        else {
            System.out.println(arr[front] + " deleted successfully..");
            front++;
        }
    }

    public void print(){
        if (isEmpty()){
            System.out.println("No data present...! queue is Empty....");
        }
        else {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
