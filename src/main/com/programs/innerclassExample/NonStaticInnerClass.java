package programs.innerclassExample;

public class NonStaticInnerClass {

    public static void main (String[] args){
        NonStaticInner innerClass = new NonStaticInner();

        // use method in NonStaticInner class to create instance inner class
        // and call display method
        innerClass.createInner();

        //another way
        NonStaticInner.InnerClass inner = innerClass.new InnerClass();
        inner.display();
    }
}



class NonStaticInner {
    private String outerField = "Outer field";

   //inner class
    class InnerClass{
        void display(){
            System.out.println("Inside non static InnerClass using the field : "+ outerField);
        }
    }

    void createInner() {
        InnerClass inner = new InnerClass();
        inner.display();
    }

}
