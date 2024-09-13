package programs.stacks;

public class StacksArray {

    public static void main(String[] args) {

        StacksArray s = new StacksArray(10);
        System.out.println("Pushing Data :");
        s.push(9); s.push(40); s.push(90); s.push(45);
        s.push(33); s.push(20); s.push(10);
        s.display();

        System.out.println("Pop Data :"+ s.pop());
        s.display();


    }

    int data[];
    int top;

    public StacksArray(int length) {
        data = new int[length];
        top = 0;
    }

    /* primitive method*/
    int getLength() {
        return top;
    }

    boolean isEmpty() {
        return top == 0;
    }

    boolean isFull() {
        return top == data.length;
    }

    /* fundamental methods*/

    public void push(int ele) {
        if (isFull()) {
            System.out.println("Stack is Full");
        } else {
            data[top] = ele;
            top++;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        int ele = data[top-1];
        top--;
        return ele;
    }

    int peek(){
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return data[top-1];
    }

    void display(){
        for (int i = 0; i < top; i++) {
            System.out.println("[ "+data[i]+ " ]");
        }
    }




}
