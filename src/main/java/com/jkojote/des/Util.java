package com.jkojote.des;

public final class Util {

    public static String toBin(long number) {
        var str = Long.toBinaryString(number);
        var result = "";
        while (str.length() < 64) {
            str = "0" + str;
        }

        for (int i = 0; i < 64; i += 8) {
            result += str.substring(i, i + 8) + " ";
        }

        return result;
    }
}
