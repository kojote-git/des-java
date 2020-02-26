package com.jkojote.main;

import java.nio.charset.Charset;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var des = new Des();
        var key = 0x133457799BBCDFF1L;
//        var block = 0x0123456789ABCDEFL;
//        var block = 0xf0000000;
        var string = "I should have known";
        var bytes = string.getBytes(Charset.defaultCharset());
//        var encrypted = des.encryptBytes(bytes, key);
//        var decrypted = des.decryptBytes(encrypted, key);
//		var encrypted = des.encryptBlock(block, key);
//		var decrypted = des.decryptBlock(encrypted, key);
		var encrypted = des.encryptString(string, key);
		var decrypted = des.decryptString(encrypted, key);

//        System.out.println(Arrays.equals(decrypted, bytes));
        System.out.println(decrypted.equals(string));
//        System.out.println(block == decrypted);
    }
}