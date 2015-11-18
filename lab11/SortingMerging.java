import java.util.Scanner;
public class SortingMerging {
   
   // array1[20] with random numbers
   public static int[] arr1(){
        int[] array = new int[20];
        for (int i=0; i<20; i++){
            int randomN = (int)(Math.random() * 100);   // obtain random #
            array[i] = randomN;                         // assign random # to array
        }
        return array;
   }
   
   // take array as input n sort elements of array in ascending order
   public static int[] sort(int[] array){                   // method cannot be void or wont run with array methods
       for (int i=1; i<array.length; i++){
           for (int j=i; j>0 && array[j]<array[j-1]; j--){
               int temp = array[j];
               array[j] = array[j-1];
               array[j-1] = temp;
           }
       }
       return array;
   }
   
   // array2[10] with random numbers
    public static int[] arr2(){
        int[] array = new int[10];
        for (int i=0; i<10; i++){
            int randomN = (int)(Math.random() * 100);   // obtain random #
            array[i] = randomN;                         // assign random # to array
        }
        return array;
    }
    
    // sort first n second array using method sort n print their values
    public static void print1(){                        // void method, printing, not returning
        int[] array1 = sort(arr1());                    // declare arrays in this method
        int[] array2 = sort(arr2());                        // set sorted arrays as declared
        // print sorted arrays
        // need a for loop to print each array
        for (int a=0; a<20; a++){
            System.out.println("Array1["+a+"] = "+array1[a]);
        }
        for (int b=0; b<10; b++){
            System.out.println("Array2["+b+"] = "+array2[b]);
        }
    }
    
    // array3[30] as arr1 n arr2 and print
    public static void arr3(){                      // no need to return anything so method is void
        int[] array = new int[30];
        // bring arrays 1 and 2 into this method
        int [] array1 = arr1();
        int [] array2 = arr2();
        
        // combine both arrays into single array
        for (int i=0; i<30; i++){
            if (i<array1.length){
                array[i] = array1[i];               // set first 20 positions of arr3 for arr1
            }
            else{
                array[i] = array2[i-20];            // set next 10 positions of arr3 for arr1
            }                                       // use i-20 to get 10, since i=30
        }
        // sort this single array
        int [] array3 = sort(array);
        
        // need a for loop to print an array
        for (int c=0; c<30; c++){
            System.out.println("Array["+c+"] = "+array3[c]);
        }
    }
    
    // call print methods in main to execute printing
    public static void main(String [] args){
        print1();
        arr3();
    }
}