package com.example.demo.utils;

import java.util.Random;

public class MathLib {

    public static String generateRandomBits(int size) {
        Random random = new Random();
        StringBuilder bits = new StringBuilder();

        for (int i = 0; i < size; i++) {
            int bit = random.nextInt(2);  // Generates either 0 or 1
            bits.append(bit);
        }

        return bits.toString();
    }

    public static int binaryStringToInt(String binaryString) {
        if (binaryString == null || !binaryString.matches("[01]+")) {
            throw new IllegalArgumentException("Invalid binary string");
        }

        return Integer.parseInt(binaryString, 2);
    }

    public static String intToBinaryString(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static String getSubstring(String binaryString, int startIndex, int endIndex) {
        if (binaryString == null || startIndex < 0 || endIndex > binaryString.length() || startIndex > endIndex) {
            throw new IllegalArgumentException("Invalid input parameters");
        }

        return binaryString.substring(startIndex, endIndex + 1);
    }

    
}
