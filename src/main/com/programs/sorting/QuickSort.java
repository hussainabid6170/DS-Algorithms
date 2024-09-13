package programs.sorting;

import programs.utilties.UtilityClass;

import java.util.Arrays;

public class QuickSort {

    public static void main (String[] args){

        int[] ar = UtilityClass.randomArray(6,10);
        System.out.println("Original Array: "+ Arrays.toString(ar));
        quickSort( ar , 0 , ar.length);

    }

    public static void quickSort(int[] ar , int low , int high){
        if(low < high){
            int pivot = partition(ar , low , high);
            quickSort(ar,low , pivot-1);
            quickSort(ar,pivot+1 , high);
        }
    }

    public static int partition(int[] ar, int low , int high){




    }



}
