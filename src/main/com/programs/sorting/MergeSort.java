package programs.sorting;

import programs.utilties.UtilityClass;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args ){

        int[] a = UtilityClass.randomArray(6, 10);
        System.out.println("Original Array: "+ Arrays.toString(a));
        mergeSort(a, 0, a.length-1);

        System.out.println("final Array: "+ Arrays.toString(a));

    }

    private static void mergeSort(int[] a, int L , int R) {
        if(L < R ) {
            int mid = (L+R)/2;
            mergeSort(a, L, mid);
            mergeSort(a, mid+1, R);
            merge(a, L, mid, R);
        }
    }

    private static void merge(int[] a, int L , int mid , int R){
        int i =L;
        int j = mid+1;
        int k = L;
        int[] b = new int[R+1];

        while(i <= mid && j<= R ){ // combine and compare two subsets
            if(a[i] < a[j]){
                b[k] = a[i];
                i++;
            }else{
                b[k] = a[j];
                j++;
            }
            k++;
        }

        while(i <= mid ){ // if left subset is having more elements
            b[k] = a[i];
            i++;k++;
        }

        while(j<= R ){
            b[k] = a[j];
            j++;k++;
        }

        for(int x= L; x<R+1; x++){
            a[x] =b[x];
        }

        System.out.println("L:"+L+" mid:"+mid+" R:"+R+ " === Array :"+ Arrays.toString(a));

    }

}
