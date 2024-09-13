package programs.sorting;

import programs.utilties.UtilityClass;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args ){

        int[] a = UtilityClass.randomArray(6, 10);
        System.out.println("Original Array: "+ Arrays.toString(a));
        shellSort(a, a.length);

    }

    public static void shellSort(int[] arr , int n){


       for(int gap = n/2; gap>0 ; gap =gap/2) {
           for (int i = gap; i < n; i++) {// it starts from index gap and compares to the left
               int cValue = arr[i];
               int position = i;
               System.out.print(Arrays.toString(arr) + " == " + cValue  + " - "+gap+" == ");
               while (position >= gap && arr[position - gap] > cValue) {
                   arr[position] = arr[position - gap];
                   position = position-gap;
                   System.out.print(Arrays.toString(arr));
               }
               arr[position] = cValue;
               System.out.println(Arrays.toString(arr));
           }

       }


        System.out.println("Final Sorted Array :"+ Arrays.toString(arr));
    }


}
