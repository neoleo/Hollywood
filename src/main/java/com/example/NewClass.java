package com.example;

public class NewClass {
    public static void main(String... args) {
        try {
            f();
        } catch (NumberFormatException e) {
            System.out.println("NFE Caught");
        }
        catch (Exception e) {
            System.out.println("E Caught");
        }
    }
    
    static void f() throws Exception {
        try {
            throw new NumberFormatException();
        } catch(Exception e) {
            throw e;
        }
    }
}
