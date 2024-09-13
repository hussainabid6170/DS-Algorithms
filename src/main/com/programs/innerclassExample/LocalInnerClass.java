package programs.innerclassExample;

public class LocalInnerClass {
    public static void main (String[] args){
        LocalInner local = new LocalInner();
        local.display();
    }
}

class LocalInner{
   public void display(){
       System.out.println("Display Method");
       //inner class
       class InnerClass{
           void display(){
               System.out.println("Display inside inner class");
           }
       }
       InnerClass inj = new InnerClass();
       inj.display();
   }
}