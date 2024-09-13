package programs.innerclassExample;

public class NonStaticInnerClass {
    private String outerField = "Outer field";

    class InnerClass{
        void display(){
            System.out.println("Inside non static InnerClass");
        }
    }


}
