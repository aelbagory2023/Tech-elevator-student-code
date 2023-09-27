package com.techelevator.farm;

public final class Cat extends FarmAnimal{

    public Cat() {
        super("Cat", "meow");
    }

    @Override
    public String eat() {
        return "eating cat food!!!";
    }
    //commented out because we made getSound() on the FarmAnimal class final, so we can't override it
//    @Override
//    public String getSound() {
//        return "meow";
//    }
}
