package programs.queue;

public class DoubleArrayQueue {

    public static void main(String[] args){

    }

    int[] data;
    int front;
    int rear;
    int size;

    DoubleArrayQueue( int number){
        data = new int[number];
        front =0; rear =0; size =0;
    }

    int length(){
        return size;
    }

    boolean isEmpty(){
        return size ==0;
    }
    boolean isFull(){
        return size == data.length;
    }

    public void enqueueLast(int ele) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            data[rear] = ele;
            rear++;
            size++;
        }
    }

    public void enqueueFirst(int ele) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            data[rear] = ele;
            rear++;
            size++;
        }
    }



}
