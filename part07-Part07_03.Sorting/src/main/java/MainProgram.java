
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
        sort(array);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int num : array) {
            if (num > smallest) {
                continue;
            }

            smallest = num;
        }

        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int indexOfSmallest = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[indexOfSmallest]) continue;
            
            indexOfSmallest = i;
        }

        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexOfSmallest = startIndex;
        
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] > table[indexOfSmallest]) continue;
            
            indexOfSmallest = i;
        }

        return indexOfSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int num1 = array[index1];
        int num2 = array[index2];
        
        array[index1] = num2;
        array[index2] = num1;
    // write your code here
    }
    
    public static void sort(int[] array) {
        boolean lastLoopIncludedSwap = false;
        
        do {
            System.out.println(Arrays.toString(array));
            
            if (lastLoopIncludedSwap) {
                break;
            }
                       
            for (int i = 0; i < array.length; i++) {
                int indexOfSmallest = indexOfSmallestFrom(array, i);
                int currentNum = array[i];
                int smallestNumStartingFromI = array[indexOfSmallest];
                
                if (currentNum <= smallestNumStartingFromI) continue;
                
                swap(array, i, indexOfSmallest);
                lastLoopIncludedSwap = true;
            }
        }     
        while(lastLoopIncludedSwap);
    }
}
