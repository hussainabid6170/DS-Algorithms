package programs.recursion;

public class FactorialRecursion {

    public static void main (String[] ar){
        int n = 5 ;

        System.out.println("Factorial of number "+n+ " is "+ factIteration(n));
        System.out.println("Factorial of number "+n+ " is "+ factRecursion(n));
    }

    public static int factIteration(int n){
        int fact = 1;
        while(n>0){
            fact = fact * n;
            n--;
        }
        return fact;
    }

    public static int factRecursion(int n){
        if(n== 0){
            return 1;
        }
        return factRecursion(n-1) * n;
    }

}
