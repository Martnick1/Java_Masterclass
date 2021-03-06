package com.mattMartnick;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myMaxValue = " + myMaxValue + " and " + "myTotal = " + myTotal);


        // different data types are incompatible with each other

        // byte has a width of 8
        byte myMaxByteValue = 127;
        byte myNewByteValue = (byte) (myMaxByteValue / 2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myMaxShortValue = 32767;
        short myNewShortValue = (short) (myMaxShortValue / 2);
        System.out.println("myNewShortValue = " + myNewShortValue);


        // long has a width of 64
        long myMaxLongValue = 9_223_372_036_854_807L;
        System.out.println("myMaxLongValue = " + myMaxLongValue);

        // minimum value limit = the negative MaxValue - (-1)
    }
}
