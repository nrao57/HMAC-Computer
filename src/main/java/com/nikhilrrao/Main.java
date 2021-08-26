package com.nikhilrrao;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Base64;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static String readFileAsString(String file)throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    public static void main(String[] args) {
        try {
            String file = args[1];
            String json = readFileAsString(file);
            String secret = args[0];
            byte[] hmacSha256 = main.java.com.nikhilrrao.HMAC.calcHmacSha256(secret.getBytes("UTF-8"), json.getBytes("UTF-8"));
            System.out.println(String.format("Hex: %032x", new BigInteger(1, hmacSha256)));
            String base64HmacSha256 = Base64.getEncoder().encodeToString(hmacSha256);
            System.out.println("Base64: " + base64HmacSha256);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
