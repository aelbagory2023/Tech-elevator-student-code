package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.print("Enter the discount amount (w/out percentage): ");
        String discountAmount = scanner.nextLine();
        double discountAmountDouble = Double.parseDouble(discountAmount);

        System.out.println("You put in: " + discountAmountDouble);


        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        String prices = scanner.nextLine(); //"1.00 2.00 3.00"

        System.out.println("You put in" + prices);

        String[] pricesArray = prices.split(" "); //turn the list of prices into a string array
        //["1.00", "2.00", "3.00"]

        double sum = 0;
        //we need to get doubles from the string array, so that we can add them all together and come up with the total price
        for(int i = 0; i < pricesArray.length; i++) {
            double price = Double.parseDouble(pricesArray[i]); //take the current string from the array and turn it into a double
            sum += price;
        }

        //calculate the amount of money to take off the total, based on the discount amount
        double discountPercentage = discountAmountDouble / 100;
        double totalDiscountMoney = sum * discountPercentage;
        double totalPrice = sum - totalDiscountMoney;

        //print out the total price, the discount, and the final price
        System.out.println("The total cost was: " + sum);
        System.out.println("The discount amount was: " + totalDiscountMoney);
        System.out.println("Your actual cost is: " + totalPrice);

        //okay, off the rails now
        System.out.println("Thank you for your business, press y to continue.");
        String pressY = scanner.nextLine();

        if(pressY.equals("y") || pressY.equals("Y")) {
            System.out.println("Welcome to the discount store dungeon.  What is your name?");
            String name = scanner.nextLine();

            System.out.println("Hello, " + name + "!");
            System.out.println("Press 'a' to view to your inventory \n press 'b' to go on an adventure!");
            String selection = scanner.nextLine();

            if(selection.equals("a")) {
                System.out.println("Your inventory is:");
                System.out.println("1. canteen of acetone");
            }
            if(selection.equals("b")) {
                //go on an adventure
                System.out.println("You leave the store and head to the dumpster out back.");
                System.out.println("A family of overpowered raccoons lives behind the dumpster.");
                System.out.println("The raccoons are looking for a fight.  Press x to fight the raccoons.");

                boolean isVictorious = false;

                //you have to punch 10 raccoons to win
                int numberOfRaccoonsToFight = 10;

                String raccoonFight = scanner.nextLine();
                while(raccoonFight.equals("x") && numberOfRaccoonsToFight >= 1) {
                    numberOfRaccoonsToFight--;
                    System.out.println("You punch a raccoon!  There are " + numberOfRaccoonsToFight + " left.");
                    if(numberOfRaccoonsToFight == 0) {
                        isVictorious = true;
                    }
                    else {
                        raccoonFight = scanner.nextLine(); //else we keep punching raccoons?
                    }
                }
                if(!raccoonFight.equals("x") || isVictorious == false) {
                    System.out.println("Oh no, the raccoons have won!  Sorry, you have rabies.");
                }
                else {
                    System.out.println("Congratulations on fighting the dumpster raccoons.");
                }
            }
            else {
                System.out.println("You need to press 'a' or 'b'.  Follow instructions, please.");
            }

        }


    }

}