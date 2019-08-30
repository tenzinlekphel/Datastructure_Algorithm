package Algorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int [] intArray = {20, 34, 4, 54, 34, 100};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--)
        {
            for(int i = 0; i < lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }


        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }




    public static void swap(int[] array, int i, int y) {
        if (i == y) {
           return;
        }
        int temp = array[i];
        array[i] = array[y];
        array[y] = temp;


    }
}
