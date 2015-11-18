import java.util.Scanner;
public class SortingMerging {
   
   // array1[20] with random numbers
   public static int[] arr1(){
        int[] array = new int[20];
        for (int i=0; i<20; i++){
            int randomN = (int)(Math.random() * 100);   // obtain random #
            array[i] = randomN;                    // assign random # to array
        }
        return array;
   }
   
   // take array as input n sort elements of array in ascending order
   public static void sort(int[] array){
       for (int i=1; i<array.length; i++){
           for (int j=i; j>0 && array[j]<array[j-1]; j--){
               int temp = array[j];
               array[j] = array[j-1];
               array[j-1] = temp;
           }
       }
   }
   
   // array2[10] with random numbers
    public static int[] arr2(){
        int[] array = new int[10];
        for (int i=0; i<10; i++){
            int randomN = (int)(Math.random() * 100);   // obtain random #
            array[i] = randomN;                    // assign random # to array
        }
        return array;
    }
    
    // sort first n second array using method sort n print their values
    public static void int[] print1(){
        sort(arr1());
        sort(arr2());
    }
    
    // array3[30] as arr1 n arr2 and print
    //public static int[] arr3(){
        //int[] array3 = new int[30];
        
    //}
    
    
    public static void main(String [] args){
    }
}