package programs.innerclass;

public class AnonymousInnerClass {

     public static void main (String[] args){

         //Normal calling
         Animal animal = new Animal();
         animal.makeSound();

         // Inner anonymous Calling - one time use class
         Animal animalUnique = new Animal(){
             @Override
             public void makeSound(){
                 System.out.println("wrrrrrrhhh");
             }
         };
         animalUnique.makeSound();


         //Runnable interface with sub-class with no name - one time class
         Runnable newThread = new Runnable() {
             @Override
             public void run() {
                 System.out.println("I am anonymous runnable object");
             }
         };
         newThread.run();

    }

}

class Animal{
    public void makeSound(){
        System.out.println("Roooahhhh");
    }
    public void ListenSound(){
        System.out.println("ssshhhh");
    }
}
