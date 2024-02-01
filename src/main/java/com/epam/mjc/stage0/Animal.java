package com.epam.mjc.stage0;

public class Animal {
    public static void main(String[] args) {
        //optional part
        //Create an object of each class and call getDescription() method for both of them.
        //Try to explain the output results.

        Dog dog = new Dog();

        Bird bird = new Bird();

        String dogString = dog.getDescription();

        String birdString = bird.getDescription();

        System.out.println(dogString);

        System.out.println(birdString);

    }

    //создаем поля
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    //создаем конструктор
    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;

    }
    //через code-generate создаем геттеры и сеттеры

    public Animal() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    //метод класса
    public String getDescription() {
        // String animal;
        String color = this.color;
        int numberOfPaws = this.numberOfPaws;
        String numberOfPawsRes = null;
        boolean hasFur = this.hasFur;
        String hasFurRes = null;

        if (hasFur == true) {
            hasFurRes = "a";
        } else {
            hasFurRes = "no";
        }

        if (numberOfPaws == 1) {
            numberOfPawsRes = "paw";
        } else {
            numberOfPawsRes = "paws";
        }
        String animal = "This animal is mostly " + color + ". It has " + numberOfPaws + " " + numberOfPawsRes + " and " + hasFurRes + " fur.";
        return animal;
    }
}

