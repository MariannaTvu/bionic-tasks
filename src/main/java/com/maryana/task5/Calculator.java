package com.maryana.task5;

/**
 * Created by Maryana on 08.12.2016.
 */
public class Calculator {
    /**
     * interface announces it's heirs possibility to operate with two int numbers and to return int value in result
     */
    interface IntegerMath {
        int operation(int a, int b);
    }

    /**
     * @param a  first given int value
     * @param b  second give int value
     * @param op IntegerMath interface realisation with operation method implementation
     * @return result of the operation as int
     */
    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    public static void main(String... args) {
        /**
         * creation of an object of Calculator class
         */
        Calculator myApp = new Calculator();
        /**
         * implements the specified interface using lambda - expressions, avoiding creation of anonymous classes
         * it could be written like
         *    IntegerMath addition = new IntegerMath() {
         *    @Override public int operation(int a, int b) {
         *    return a + b; }
         *     };
         * but with lambdas it's more obvious and clear
         *
         * we have two realisations as result: addition and subtraction of two int values
         */
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        /**
         * calling method operateBinary witch each of the IntegerMath realisations
         * printing result in to console
         */
        System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " + myApp.operateBinary(20, 10, subtraction));
    }
}
