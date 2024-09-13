package programs.queue;

public class DoubleLinkedQueue {

    public static void main(String[] args){
        DoubleLinkedQueue dlq = new DoubleLinkedQueue();

        System.out.println("Queue is inserted");
        dlq.addFirst(901);
        dlq.addLast(890); dlq.addFirst(88);
        dlq.addFirst(9);dlq.addLast(33);
        dlq.addLast(22);
        dlq.display();

        System.out.println("removed element"+ dlq.removeFirs());
        dlq.display();

    }

    class Node{
        int element;
        Node nextNode;

        Node( int ele, Node node){
            this.element = ele;
            nextNode = null;
        }
    }

    Node front;
    Node rear;
    int size;

    DoubleLinkedQueue(){
        front = null; rear = null; size =0;
    }

    /*primitive methods*/
    int getLength(){
        return size;
    }

    boolean isEmpty(){
        return size ==0;
    }

    void addLast(int ele){
        Node element = new Node(ele , null);
        if(isEmpty()){
            front = element;
        }else{
            rear.nextNode = element;
        }
        rear = element;
        size++;
    }

    void addFirst(int ele){
        Node element = new Node(ele , null);
        if(isEmpty()){
            front = element;
            rear = element;
        }else{
            element.nextNode = front;
            front = element;
        }
        size++;

    }


    int removeFirs(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        int element = front.element;
        if (size == 1){
            front = null;
            rear = null;
        }else {
            front = front.nextNode;
        }
        size--;
        return element;
    }

    int removeLast(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        Node p = front;
        int i=1;
        while(i < size-1 ){
            p =p.nextNode;
            i++;
        }
        int lastElement = p.nextNode.element;
        rear = p;
        p.nextNode = null;
        size--;

        return lastElement;
    }

    public int first(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
         return front.element;

    }

    public int last(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return rear.element;

    }


    //For display
    void display(){
        Node v= front;
        System.out.print("Elements of Linked list :");
        while(v != null){
            System.out.print(v.element +"-->");
            v=v.nextNode;
        }
        System.out.println(" ");
    }






}
