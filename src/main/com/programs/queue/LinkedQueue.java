package programs.queue;

import programs.linkedlist.LinkedList;

/*
* I have modified this queue to support object instead of int as we are
* using this class in BST as well
*
* */


public class LinkedQueue {

    public static void main(String[] args){
        LinkedQueue ld = new LinkedQueue();

        System.out.println("Queue is inserted");
        ld.enqueue(23);  ld.enqueue(12); ld.enqueue(90);
        ld.enqueue(10); ld.enqueue(3); ld.enqueue(100);
        ld.display();


        System.out.println("deQueue "+ ld.dequeue());
        ld.display();


    }

    class Node{
        Object element;
        Node nextNode;

        Node(Object element, Node nextnode){
            this.element = element;
            nextNode = null;
        }
    }

    Node front;
    Node rear;
    int size;

    public LinkedQueue(){
        front = null;
        rear = null;
        size =0;
    }

    /*primitive methods*/
    int getLength(){
        return size;
    }

   public boolean isEmpty(){
        return size ==0;
    }

     public void enqueue(Object ele){
        Node element = new Node(ele , null);
        if(isEmpty()){
            front = element;
        }else{
            rear.nextNode = element;
        }
        rear = element;
        size++;
    }


   public  Object dequeue(){
       if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        Object element = front.element;
        if (size == 1){
            front = null;
            rear = null;
        }else {
            front = front.nextNode;
        }
        size--;
        return element;
    }


    //For display
   public void display(){
        Node v= front;
        System.out.print("Elements of Linked list :");
        while(v != null){
            System.out.print(v.element +"-->");
            v=v.nextNode;
        }
        System.out.println(" ");
    }
}
