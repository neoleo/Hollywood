package com.example;

public class NewClass {
    public static void main(String... args) {
        try {
            f();
        } catch (NumberFormatException e) {
            System.out.println("NFE Caught");
        }
        System.out.println("The End");
    }
    
    static int f() {
        try {
            throw new Exception();
        } catch(NumberFormatException e) {
            throw e;
        } finally {
            return 0;
        }
    }
}
