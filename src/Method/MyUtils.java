package Method;

public class MyUtils {
    public static void printLife() {
        System.out.println("Now time");
    }

    public static void printSomeJunk(String coolId) {
        System.out.println("Some bal bal now" + coolId);
    }

    public static void sum2Numbers(int firstArg, int secondArg) {
        System.out.println(firstArg + secondArg);
    }

    public static void add10(int someArgument) {
        System.out.println("value is " + someArgument);
    }

    public static int addValue(int value) {
        int result = value + 20;
        return result;
    }
}
