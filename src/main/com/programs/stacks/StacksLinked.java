
package programs.stacks;

public class StacksLinked {
    public static void main(String[] args){
        StacksLinked sl = new StacksLinked();

        System.out.println("Pushing Elements");
        sl.push(10);sl.push(33);sl.push(4);
        sl.push(90);sl.push(56);sl.push(78);
        sl.display();

        System.out.println("pop Elements"+sl.pop());
        sl.display();


    }

    public class Node{
        int element;
        Node next;

        Node(int element , Node next){
            this.element = element;
            this.next = next;
        }
    }

    Node top;
    int size;

    StacksLinked(){
        top = null;
        size =0;
    }

    boolean isEmpty(){
        return size ==0;
    }
    int length(){
        return size;
    }


    void push(int element){
        Node ele = new Node(element , null);
        if(isEmpty()){
            top= ele;
        }else{
            ele.next = top;
            top = ele;
        }
        size++;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            int ele = top.element;
            top = top.next;
            size--;
        }
        return -1;
    }


    void display(){
        Node p = top;
        for(int i=0; i< size; i++){
            System.out.print(p.element+"--->");
            p=p.next;
        }
        System.out.println();
    }





}
