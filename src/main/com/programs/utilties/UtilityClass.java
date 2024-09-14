package programs.utilties;

import java.util.Random;

public class UtilityClass {

    public static int[] randomArray(int n, int upperRange){
        Random rd = new Random(); // creating Random object
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(upperRange); // storing random integers in an array
        }
        return arr;
    }


    public static void swap (int A[] , int lowIndex , int highIndex){
        int temp = A[lowIndex];
        A[lowIndex] = A[highIndex];
        A[highIndex] = temp;
    }

}
