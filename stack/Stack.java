package stack;

class Stack {
    private static final int max = 1000;
    int top;
    int[] arr = new int[max];
    public Stack()
    {
        top = -1;
    }

    public boolean isEmpty(){
        if(top == -1)
            return true;
        return false;
    }

    public boolean isFull(){
        if (top == max+1)
            return true;
        return false;
    }

    public boolean push(int x){
        if (isFull()){
            System.out.println("Stack is overflow...");
            return false;
        }
        else {
            arr[++top] = x;
            System.out.println(x + " is pushed..");
            return true;
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("stack is underflow...");
            return -1;
        }else
        {
            int x = arr[top];
            top = top-1;
            System.out.println(x + " deleted successfully...");
            return x;

        }
    }

    public void show(){
        for (int i = top; i >= 0; i--){
            System.out.print(" " + arr[i]);
        }
    }
}
