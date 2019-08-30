package dataStructure;

public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -24;
        intArray[3] = -44;
        intArray[4] = -54;
        intArray[5] = -64;
        intArray[6] = -124;

        int index = -1;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 7) {
                index = i;
                break;
            }
        }

        System.out.printf("index value" + index);


    }
}
