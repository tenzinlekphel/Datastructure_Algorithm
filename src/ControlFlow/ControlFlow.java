package ControlFlow;

public class ControlFlow {

    public static void main(String[] args) {

        boolean hungry = true;

        if(!hungry) {
            System.out.println("Im starving ....");
        } else {
            System.out.println("Im not hungry");
        }

        int hungerRating = 4;

        if(hungerRating < 6) {
            System.out.println("Not Hungry");
        } else {
            System.out.println("Hungry time");
        }

        int favoriteTemp = 75;
        int currentTemp = 50;
        String opinion = " nothing";

        if(currentTemp < favoriteTemp - 40) {
            opinion = "It is cold now";

        } else if(currentTemp < favoriteTemp - 20){
            System.out.println("No weather ");

        } else {
            opinion = "It is a beautiful day....";
        }
        System.out.println(opinion);
    }

    int month = 12;
    String monthString;

}
