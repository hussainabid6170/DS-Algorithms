package programs.sorting;

import programs.utilties.UtilityClass;

import java.util.Arrays;

public class QuickSort {

    public static void main (String[] args){

        int[] ar =  {7, 8, 0, 7, 9, 5} ;//UtilityClass.randomArray(6,10);
        System.out.println("Original Array: "+ Arrays.toString(ar));
        quickSort( ar , 0 , ar.length-1);

    }

    public static void quickSort(int[] ar , int low , int high){
        if(low < high){
            System.out.println( "low index "+low +" high "+high+" === "+ Arrays.toString(ar));
            int piIndex = partition(ar , low , high);
            System.out.println( " ");
            System.out.println( "Pivot Index "+piIndex +" pivalue "+ar[piIndex]+" === "+ Arrays.toString(ar));
            quickSort(ar,low , piIndex-1);
            quickSort(ar,piIndex+1 , high);
            System.out.println(Arrays.toString(ar));
        }
    }

    public static int partition(int[] ar, int low , int high){
            int pivot = ar[low];
            int left = low +1;
            int right = high;

            while(left <= right){
                // Move left index towards the right until an element larger than the pivot is found
                while(left <= right && ar[left] <= pivot ){
                    left++;
                }

                // Move right index towards the left until an element smaller than the pivot is found
                while(left <= right && ar[right]  > pivot ){
                    right--;
                }

                // Swap the elements at the left and right indices if needed
                if(left < right){
                    System.out.print("Swap of "+ left +" & "+ right +" "+Arrays.toString(ar));
                    UtilityClass.swap (ar, left ,right);
                    System.out.println(" = "+Arrays.toString(ar));
                }
            }

        // Place the pivot element in its correct position
        System.out.print("Swap of "+ low +" & "+ right +" "+Arrays.toString(ar));
        UtilityClass.swap (ar, low ,right);
        System.out.println(" = "+Arrays.toString(ar));
        return right;
    }

}
