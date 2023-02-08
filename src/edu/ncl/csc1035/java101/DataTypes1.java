package edu.ncl.csc1035.java101;

public class DataTypes1 {
    public static void main(String[] args) {
        int i = 26;
        double d = 3.14;
        char c = 'a';
        boolean b = true;

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);

        String s = "Hello";
        System.out.println(s);
        double test = i/d;
        System.out.println(test);
        foo(5);
    }
    public static void foo(int x){
        x = x + 14;
        System.out.println(x);
    }
}
