package programs.innerclassExample;

public class StaticInnerClass {

    public static void main (String[] args){
        // No need to create an instance of OuterClass
        StaticInner.InnerClass innerClass = new StaticInner.InnerClass();
        innerClass.display();
    }
}

class StaticInner{
   private String outerField = "Outer Field variable";
   //Inner Class
    static class InnerClass{
         void display(){
            System.out.println("Inside static inner class");
        }
    }
}
