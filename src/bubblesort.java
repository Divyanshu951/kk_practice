import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] array = {5, 3, 4, 3, 2, 1};
        bubsort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void bubsort(int[] array) {
        // run the steps n-1 times
        for(int i = 0; i < array.length-1; i++){
            // for each step the highest element will be in the last respective event
            for(int j = 0; j < array.length-i-1; j++){
                // swap if the item is smaller than the previous item
                //change
                if(array[j+1] < array[j]){
                    // swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}

