package Operators;

import Method.MyUtils;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        int c = a | b;

        int sum = 10;
        sum >>= 20;
        System.out.println(c);
        System.out.println(sum);

        int result = MyUtils.addValue(4);
        System.out.println(result);

    }
}
