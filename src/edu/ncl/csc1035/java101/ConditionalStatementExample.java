package edu.ncl.csc1035.java101;

public class ConditionalStatementExample {
    public static void main(String[] args) {
        boolean valid = true;
        if (valid == true ){
            System.out.println("Your solution is VALID");

        }
        else {
            System.out.println("Your Solution is INVALID");
        }
        int input = 1;
        switch(input) {
            case 1:
                System.out.println("A partridge in a pear tree");
                break;
            case 2:
                System.out.println("Two turtle doves");
                break;
            case 3:
                System.out.println("Three French hens");
                break;
        }
    }
}
