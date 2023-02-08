package edu.ncl.csc1035.java101;

public class LoopsExample {
    public static void main(String[] args) {
        //For loop
        for (int i = 0; i < 10;i = i + 1) {
            System.out.println("This is on loop " + i);
        }
        //While loop
        int j = 0;
        while (j<10){
            System.out.println("This is on loop " + j);
            j = j + 2;
        }
        //Do While loop
        int k = 2;
        do{
            System.out.println("This is on loop " + k);
            k = k + 3;
        }
        while (k < 15);

        //Looping through arrays
        String[] days = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        //For each loop
        for (String day : days) {
            //Uses the temporary variable day for each item in the array
            System.out.println(day);
        }
        int[] ages = {24, 31, 29, 40, 18, 20, 42, 50};
        double total = 0;
        for (int age : ages){
            System.out.println("Age : " + age);
            total = total + age;
        }
        System.out.println("Total ages = " + total);

    }
}
