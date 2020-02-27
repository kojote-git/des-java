package com.jkojote.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        var des = new Des();
        var reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("Write a message to encrypt: ");
            var plainString = reader.readLine();
            var key = des.nextKey();
            var encryptedMessage = des.encryptString(plainString, key);
            var decryptedMessage = des.decryptString(encryptedMessage, key);

            System.out.println("Key: 0x" + Long.toHexString(key).toUpperCase());
            System.out.println("Encrypted message: " + encryptedMessage);
            System.out.println("Decrypted message: " + decryptedMessage);
            System.out.println("Initial message  : " + plainString);
            System.out.println();
        }

    }
}