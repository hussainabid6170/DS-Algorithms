package programs.linkedlist;

public class DoublyLinkedList {

    public static void main(String[] args){
        DoublyLinkedList dl = new DoublyLinkedList();

        dl.addLast(10);
        dl.addLast(90);
        dl.addLast(30);
        dl.addLast(40);
        dl.display();
        System.out.println("Length of List:"+ dl.length());



        System.out.println();
        System.out.println("add element first  2000" );
        dl.addFirst(2000);
        dl.display();
        System.out.println("Length of List:"+ dl.length());


        System.out.println();
        System.out.println("add element 99 location 3" );
        dl.addAny(99, 3);
        dl.display();
        System.out.println("Length of List:"+ dl.length());

        System.out.println();
        System.out.println("Remove first element"+dl.removeFirst() );
        dl.display();
        System.out.println("Length of List:"+ dl.length());

        System.out.println();
        System.out.println("Remove Last element :: "+ dl.removeLast());
        dl.display();
        System.out.println("Length of List:"+ dl.length());


        System.out.println();
        System.out.println("Remove element  given at 3 location :: "+ dl.removeAny(3));
        dl.display();
        System.out.println("Length of List:"+ dl.length());

    }


    class Node {
        int element;
        Node prev;
        Node next;

        Node(int element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;

        }
    }

    Node head;
    Node tail;
    int size;

    DoublyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    int length(){
        return size;
    }

    boolean isEmpty(){
        return size == 0;
    }

    /* methods*/

    void addLast(int ele){
        Node newElement = new Node(ele, null, null);
        if(isEmpty()){
            head = newElement;
        }else{
            newElement.prev = tail;
            tail.next =newElement;
        }
        tail = newElement;
        size++;
    }

    void addFirst(int ele){
        Node newElement = new Node(ele , null, null);
        if(isEmpty()){
            tail = newElement;
        }else{
            newElement.next = head;
            head.prev = newElement;
        }
        head = newElement;
        size++;
    }

    void addAny(int ele, int position) {

        Node newElement = new Node(ele, null, null);
        if (isEmpty()) {
            head = newElement;
            tail = newElement;
            size++;
        } else if (position == 1) {
            addFirst(ele);
        } else if (position == length()) {
            addLast(ele);
        } else {
            Node p = head;
            int i = 1;
            while (i < position - 1) {
                p = p.next;
                i++;
            }

            // P is the element before the location and
            //p.next is the location
            newElement.next = p.next;
            newElement.prev = p;
            p.next.prev = newElement;
            p.next = newElement;
            size++;
        }
    }

    int removeFirst() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return -1;
        } else if (length() == 1) {
            Node p = head;
            head = null;
            tail = null;
            size = 0;
            return p.element;
        } else {
            Node p = head;
            head = head.next;
            head.prev = null;
            size--;
            return p.element;
        }

    }

    int removeLast(){
        if(isEmpty()){
            System.out.println("List is Empty");
            return -1;
        }else if(length() == 1){
            return removeFirst();
        }else {
            Node p = tail;
            tail = tail.prev;
            tail.next = null;
            size--;
            return p.element;
        }
    }

    int removeAny(int position){

        if(isEmpty()){
            System.out.println( "List is Empty");
            return -1;
        }else if(position == 1){
            return removeFirst();
        }else if(position == length()){
            return removeLast();
        }else{
            Node p = head;
            int i =1;
            while(i< position -1){
                p = p.next;
                i++;
            }
            //p.next element to be deleted
            Node elementDeleted = p.next;
            p.next = elementDeleted.next;
            p.next.prev = p;
            size--;
            return elementDeleted.element;
        }

    }


    /*Display Elements*/

    void display(){
        if(isEmpty()){
            System.out.println("List is empty");
        }else{
            Node p = head;
            System.out.print("List of elements : ");
            while(p != null){
                System.out.print(p.element +"-->");
                p= p.next;
            }
            System.out.println();
        }
    }
}
