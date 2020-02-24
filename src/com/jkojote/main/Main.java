package com.jkojote.main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var des = new Des();
        var key = 0x133457799BBCDFF1L;
        var block = 0x0123456789ABCDEFL;
        var string = "aaaaaaaa";
        var bytes = string.getBytes();
        var encrypted = des.encryptBytes(bytes, key);
        var decrypted = des.decryptBytes(encrypted, key);
//		var encrypted = des.encryptBlock(block, key);
//		var decrypted = des.decryptBlock(encrypted, key);
//		var encrypted = des.encryptString(string, key);
//		var decrypted = des.decryptString(encrypted, key);

        System.out.println(Arrays.equals(decrypted, bytes));
    }
}