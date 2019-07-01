package com.sda.repeating.names;

public class MainProgram {
    public static void main(String[] args) {
        NameCounter myName = new NameCounter("Sylwester Kukla");

        int myNameSum = myName.sumOfLetters();

        System.out.println("Suma liter mojego imienia wynosi: " + myNameSum);
        System.out.println("Madulo 2 z " + myNameSum + " wynosi: " + myNameSum%2);



    }
}
