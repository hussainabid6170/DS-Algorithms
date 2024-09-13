package programs.recursion;


public class RecursionProgram {
    public static void main(String[] args) {

        System.out.println("*** TAIL RECURSION ****");
        tailRecursion(4);
        System.out.println("*** HEAD RECURSION ****");
        headRecursion(4);
        System.out.println("*** TREE RECURSION ****");
        treeRecursion(3);
        System.out.println("*** ImDirect RECURSION ****");
        indirectRecursion(8);

    }

    public static void tailRecursion(int n){
        if(n > 0){
            int k = n * n;
            System.out.println(k);
            tailRecursion(n-1);
        }
    }


    public static void headRecursion(int n){
        if(n > 0){
            headRecursion(n-1);
            int k = n * n;
            System.out.println(k);
        }
    }

    public static void treeRecursion(int n){
        if(n > 0){
            treeRecursion(n-1);
            int k = n * n;
            System.out.println(k);
            treeRecursion(n-1);
        }
    }

    public static void indirectRecursion(int n){
        if(isEven(n)){
            System.out.println("Is Even Number:" + n);
        }else{
            System.out.println("Is Odd Number:" + n);
        }
    }

    public static boolean isEven(int n){
        if(n==0){
            return true; // Base case: 0 is even
        }else{
            return isOdd(n-1);// Indirect recursive call to isOdd
        }
    }

    public static boolean isOdd(int n){
        if(n==0){
            return false; // Base case: 0 is not odd
        }else{
            return isEven(n-1); // Indirect recursive call to isEven
        }
    }


}