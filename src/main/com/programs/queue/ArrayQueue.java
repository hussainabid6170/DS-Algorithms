package programs.queue;

public class ArrayQueue {

/*    public static void main(String[] args) {
        ArrayQueue aq = new ArrayQueue(6);

        System.out.println("Queue add last inserted");
        aq.addLast(180); aq.addLast(33); aq.addLast(57);
        aq.addLast(190); aq.addLast(89); aq.addLast(44);
        aq.display();

       // System.out.println("deQueue "+ aq.removeFirst());
         aq.display();

        System.out.println("Queue add first inserted");
        aq.addFirst(5); aq.addFirst(6); aq.addFirst(7);
        aq.display();

        System.out.println("deQueue "+ aq.removeRear());
        aq.display();



    }

  static int data[];
    int front;
    int rear;
    int size;

    ArrayQueue(int number) {
        data = new int[number];
        front = 0;
        rear = 0;
        size = 0;
    }

    //primitive methods

    int getlength() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == data.length;
    }

    //fundamental methods

    public void addLast(int ele) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else if (isEmpty()) {
            front = rear = 0;
            data[rear] = ele;
            size++;
        }else {
            data[rear] = ele;
            rear++;
            size++;
        }

    }

    public void addFirst(int ele) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot add " + ele + " to the front.");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            front = (front - 1 + data.length) % data.length;
        }
        data[front] = ele;
        size++;
    }




    public int removeFirst () {

        if(isEmpty()){
            System.out.println("Queue is Full");
        }else{
            int element = data[front];
            front++;
            size--;
            return element;
        }

        return -1;
    }

    public int removeRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot remove from the rear.");
            return -1;
        }
        int removedElement = data[rear];
        if (front == rear) { // Deque is now empty
            front = rear = -1;
        } else {
            rear = (rear - 1 + data.length) % data.length;
        }
        size--;
        return removedElement;
    }

    public void display(){

        for (int i = front; i < rear; i++) {
            System.out.print(data[i]+"-->");
        }
        System.out.println();
    }

*/
}
