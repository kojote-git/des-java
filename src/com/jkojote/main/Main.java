package com.jkojote.main;

public class Main {
	public static void main(String[] args) {
	    var des = new Des();
	    var block = 0x0123456789ABCDEFL;
	    var key = 0x133457799BBCDFF1L;
	    var encrypted = des.encrypt(block, key);
	    var decrypted = des.decrypt(encrypted, key);
        System.out.println(decrypted == block);
	}
}