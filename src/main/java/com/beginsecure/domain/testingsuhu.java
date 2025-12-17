package com.beginsecure.domain;

public class testingsuhu {
    public static String kategoriSuhu(double suhu) {
        if (suhu >= 40) {
            return "Panas";
        } else if (suhu >= 20) {
            return "Normal";
        } else {
            return "Dingin";
        }
    }


    public static void main(String[] args) {
        System.out.println(" white-box automated testing.");
    }
}
