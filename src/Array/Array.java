package Array;

public class Array {
    public static void main(String[] args) {

        int [] values = new int[10];
        values[0] = 1000;
        values[9] = 34;

        double [] volumes = new double[20];
        System.out.println("Value of first index " + values[0]);
        System.out.println("Value of first index " + values[9]);


        System.out.println("New volumes are" );

        String [] words = new String[3];
        words[0] = "Tenzin";
        words[1] = "Dolma";
        words[2] = "passang";
        System.out.println(words[2]);

        for(int i = 0; i < words.length; i++) {
            System.out.println("These are students names: " + words[i]);
        }



    }
}
