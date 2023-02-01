package code.java101.overloading;

public class WhatTheHeck {
    public void test(String s) {
        System.out.println("String");
    }

    public void test(Object o) {
        System.out.println("Object");
    }

    public static void main(String[] args) {
        WhatTheHeck that = new WhatTheHeck();
        that.test(null);
    }
}
