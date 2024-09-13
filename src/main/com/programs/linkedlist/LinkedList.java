package programs.linkedlist;

public class LinkedList {

    public static void main(String[] args){
        LinkedList l1 = new LinkedList();
        l1.addLast(7);
        l1.addLast(12);
        l1.addLast(35);
        l1.addLast(70);
        l1.addLast(120);
        l1.addLast(350);
        l1.display();
        System.out.println("");

        // Add at first position
        l1.addFirst(2000);
        l1.display();
        System.out.println("");

        // Add at given position
        l1.addAny(1000,2);
        l1.display();
        System.out.println("");

        //delete first element
        System.out.println("First Element deleted  is :"+ l1.deleteFirst());
        l1.display();
        System.out.println();

        // delete Last Element
        System.out.println("Last Element deleted  is :"+ l1.deleteLast());
        l1.display();
        System.out.println();

        // delete Last Element
        System.out.println(" Element deleted at position 3 is :"+ l1.deleteAny(3));
        l1.display();
        System.out.println();

        // delete Last Element
        System.out.println(" Element found at position  is :"+ l1.searchKey(70));
        l1.display();
        System.out.println();

        // Insert sorted into the linked list
        LinkedList l2 = new LinkedList();
        l2.insertSorted(7);
        l2.insertSorted(90);
        l2.insertSorted(35);
        l2.insertSorted(80);
        l2.insertSorted(0);
        l2.insertSorted(10);
        System.out.println(" Inserted element in sorted");
        l2.display();
        System.out.println();

    }

    //Inner Class for node
    class Node{
        int element;
        Node next;

        Node( int e , Node n){
            element = e;
            next = n;
        }
    }

    private Node head;
    private Node tail;
    int size ;

    public int getLength(){
       return size;
    }

    public boolean isEmpty(){
        return size ==0;
    }

    LinkedList(){
        head = null;
        tail = null;
        size =0;
    }

    /*  Operations Methods*/

    //adding element at first position
    void addFirst(int element){
        Node newElement = new Node(element, null);
        if(isEmpty()){
            head = newElement;
            tail = newElement;
        }else{
            newElement.next = head;
            head = newElement;
        }
        size++;
    }

    //adding element at last position
    void addLast( int element){
        Node newElement = new Node(element, null);
        if(isEmpty()){
            head = newElement;
        }else{
            tail.next= newElement;
        }
        tail = newElement;
        size++;
    }

    //adding element at given position
    void addAny(int element, int position){
        Node newElement = new Node(element, null);

        if(position <= 1){
            addFirst(element);
        }else if (position >= size){
            addLast(element);
        }else{
            Node p = head;
            int i =1;
            while(i < position -1 ){
                p =p.next;
                i++;
            }
            // P is the element before our location
            //we are put our element in front of p.next
            newElement.next = p.next;
            p.next= newElement;// replace p.next linking with our element
        }
        size++;
    }

    //First Element we are removing
     int deleteFirst(){
        if(isEmpty()){
            System.out.println("List is empty");
            return -1;
        }
        int element = head.element;//First element we are deleting
        Node p = head;
        head = p.next;
        size--;
        if(isEmpty()){
            tail = null;
        }
        return element;
    }


    // Last element deleting
    int deleteLast(){

        if(isEmpty()){
            System.out.println("List is empty");
            return  -1;
        }
        Node h = head;
        int i =1;
        while(i < size -1){
            h = h.next;
            i++;
        }
        int element = tail.element;//last element we are deleting
        tail = h;
        tail.next = null;
        size--;

     return element;
    }


    // Delete at specific location
    int deleteAny(int position) {

        if (isEmpty()) {
            System.out.println("List is empty");
            return -1;
        }
        if (position == 1) {
            return deleteFirst();
        } else if (position == size) {
            return deleteLast();
        }

        Node p = head;
        int i = 1;
        while (i < position - 1) {
            p = p.next;
            i++;
        }
        // p will be element before one which we are deleting
        //p.next is the element we are deleting
        int element = p.next.element;
        p.next = p.next.next;// link element after the deleting element
        size--;

        return element;
    }

    //search a key value

    int searchKey(int key) {

        if (isEmpty()) {
            System.out.println("list is empty");
            return -1;
        }
        Node p = head;
        int index = 0;

        while (p != null) {
            if (p.element == key) {
                return index;
            } else {
                p = p.next;
            }
            index++;
        }

        return -1;
    }

    void insertSorted(int ele) {
        Node newElement = new Node(ele, null);
        if (isEmpty()) {
            head = newElement;
        } else {
            Node p = head;
            Node q = head;
            while (p != null && p.element < ele) {
                q = p;
                p = p.next;
            }

            // q is before  p > element
            if (p == head) {// check for the element is less than the first element
                newElement.next = head;
                head = newElement;
            } else {
                newElement.next = q.next;
                q.next = newElement;
            }
        }
        size++;
    }

    //For display
    void display(){
        Node v= head;
        System.out.print("Elements of Linked list :");
        while(v != null){
            System.out.print(v.element +"-->");
            v=v.next;
        }
        System.out.println(" ");
    }
}
