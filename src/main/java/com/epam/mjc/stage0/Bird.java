package com.epam.mjc.stage0;

public class Bird extends Animal{
public Bird (){
    super.setColor("blue");
    super.setNumberOfPaws(2);
    super.setHasFur(false);
}

    @Override //с помощью ctrl+o
    public String getDescription() {
        String color = super.getColor();
        int numberOfPaws = super.getNumberOfPaws();
        String numberOfPawsRes = null;
        boolean hasFur = super.isHasFur();
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
        String animal = "This animal is mostly " + color + ". It has " + numberOfPaws + " " + numberOfPawsRes + " and " + hasFurRes + " fur. Moreover, it has 2 wings and can fly.";

        return animal;
    }
}
