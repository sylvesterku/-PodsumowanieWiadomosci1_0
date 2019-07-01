package com.sda.repeating.names;

public class NameCounter {
    private String fullName;

    public NameCounter(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private char[] letters () {
        String name = fullName.toUpperCase();
        return name.toCharArray();
    }

    public int sumOfLetters(){
        int counter = 0;

        for (int i = 0; i < letters().length; i++) {
            if (letters()[i] == ' ') {
                counter += 0;
            } else {
                counter += letters()[i] - 64;
            }
        }
        return counter;
    }
}
