package programs.recursion;

public class SumofNumberRecursion {


    public static void main(String[] ar){

        System.out.println("Sum of number using formula"+ sumN(5));
        System.out.println("Sum of number using formula"+ sumNIteration(5));
        System.out.println("Sum of number using formula"+ sumNRecursion(5));
    }

    public static int sumN (int n){
        return n * (n+1) /2; // O(1) as e have formula
    }

    public static int sumNIteration (int n){
        int total =0;
        int i =0;
        while(i<=n){
            total += i;
            i++;
        }
        return total;
    }

    public static int sumNRecursion (int n){
        if(n == 0){
            return 0;
        }else{
            return sumNRecursion(n-1) + n;
        }
    }


}
