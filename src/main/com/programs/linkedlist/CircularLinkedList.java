package programs.linkedlist;

public class CircularLinkedList {

    public static void main(String[] args) {

        CircularLinkedList cl = new CircularLinkedList();
        cl.addLast(90);
        cl.addLast(10);
        cl.addLast(20);
        cl.addLast(40);
        cl.addLast(1000);
        cl.display();
        System.out.println("Length of List:"+ cl.length());

        System.out.println();
        System.out.println("add element first location 2000" );
        cl.addFirst(2000);
        cl.display();
        System.out.println("Length of List:"+ cl.length());

        System.out.println();
        System.out.println("add element first location 3000" );
        cl.addFirst(3000);
        cl.display();
        System.out.println("Length of List:"+ cl.length());

        System.out.println();
        System.out.println("add element 4000 given location 3 " );
        cl.addAny(4000, 3);
        cl.display();
        System.out.println("Length of List:"+ cl.length());

        System.out.println();
        System.out.println("Remove first element"+cl.removeFirst() );
        cl.display();
        System.out.println("Length of List:"+ cl.length());


        System.out.println();
        System.out.println("Remove Last element :: "+ cl.removeLast());
        cl.display();
        System.out.println("Length of List:"+ cl.length());

        System.out.println();
        System.out.println("Remove element  given at 3 location :: "+ cl.removeAny(3));
        cl.display();
        System.out.println("Length of List:"+ cl.length());


    }

    /*primitive Declaration*/
    class Node {
        int element;
        Node nextNode;

        Node(int ele, Node nextNode) {
            element = ele;
            this.nextNode = nextNode;
        }
    }

    private Node head;
    private Node tail;
    int size;

    /*methods for */
    int length() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    private void CircularLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }


    /* methods for */

    void addLast( int element){
        Node newElement = new Node( element , null);
        if(isEmpty()){
            head = newElement;
            newElement.nextNode = head;
        }else{
            // assign tail to head link
            newElement.nextNode = tail.nextNode;
            tail.nextNode = newElement;// link the tail element with new element
        }
        tail = newElement;
        size++;

    }

    void addFirst(int element){

        Node newElement = new Node( element , null);

        if(isEmpty()){
            newElement.nextNode = newElement;
            tail = newElement;
        }else{
            newElement.nextNode = head;
            tail.nextNode = newElement;
        }
        head = newElement;
        size++;
    }

    void addAny(int element , int position){

        Node newElement = new Node(element, null);
        if(isEmpty()){
            newElement.nextNode = newElement;
            head = newElement;
            tail = newElement;
        }else if (position <=1){
            addFirst(element);
        }else if (position >= length()) {
           addLast(element);
        }else{
           Node p= head;
            int i =1;
           while(i < position-1){
               p = p.nextNode;
               i++;
           }
           newElement.nextNode =p.nextNode;
           p.nextNode = newElement;
        }
        size++;
    }

    //remove an element

    int removeFirst(){

        if(isEmpty()){
            System.out.println("List is Empty");
        }else if(length() == 1){
            head = null;
            tail = null;
            size =0;
        }else {
            int elementRemoved = head.element;
            head = head.nextNode;
            tail.nextNode = head;
            size--;
            return elementRemoved;
        }
        return -1;
    }


    int removeLast(){
        if(isEmpty()){
            System.out.println( "List is Empty");
        }else if(length() == 1){
            int elementRemoved = head.element;
            head = null;
            tail = null;
            size = 0;
            return elementRemoved;
        }else{
            Node p = head;
            int i =1;
            while(i < length()-1){// before the last element
                p = p.nextNode;
                i++;
            }
            // P is now before the last node
            int elementRemoved = tail.element;
            tail = p;
            tail.nextNode = head;
            size--;
            return elementRemoved;
        }

        return -1;
    }

    int removeAny(int position){

        if(isEmpty()){
            System.out.println("List is Empty");
        }else if(position ==1) {
            return removeFirst();
        }else if(position == length() ){
            return removeLast();
        }else{
            Node p = head;
            int i =1;
            while(i< position-1 ){
                p =p.nextNode;
                i++;
            }

            //P is element before the element we are deleting
            //p.nextnode is the elemenet we are deleting
            int removedElement = p.nextNode.element;
            p.nextNode = p.nextNode.nextNode;
            size--;
            return removedElement;
        }
        return -1;
    }


    //method to display elements
    void display() {
        Node p = head;
        if (isEmpty()) {
            System.out.println(" List is Empty");
        }
        int i = 1;
        System.out.print("List of elements : ");
        while (i <= length()) {
            System.out.print(p.element + "-->");
            p = p.nextNode;
            i++;
        }
        System.out.println();


    }

}