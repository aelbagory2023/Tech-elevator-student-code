package com.techelevator;

import classes.Person;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class PersonBuilderApp {

    public void RunApp() {

        Scanner scanner = new Scanner(System.in);
        boolean willContinue = true;

            do {
                System.out.println("Welcome to the person builder!");

                System.out.println("What is the person's first name?");
                String firstName = scanner.nextLine();

                System.out.println("What is the person's last name?");
                String lastName = scanner.nextLine();

                System.out.println("What is the person's age?");
                String age = scanner.nextLine();
                int parsedAge = parseInt(age);

                System.out.println("Do they have a job? Press 'Y' for yes.");
                String employed = scanner.nextLine();
                String workplace = null;
                if (employed.equals("Y") || employed.equals("y")) {
                    System.out.println("Where do they work?");
                    workplace = scanner.nextLine();
                }

                //build the person object based on the data that was typed in
                Person person = new Person(firstName, lastName, parsedAge);
                if (workplace != null) {
                    person.setWorkplace(workplace);
                }

                System.out.println("************************************");
                System.out.println("You built a person!");
                System.out.println(person.toString());

                System.out.println("************************************");
                System.out.println("Would you like to build another person? Press Y for yes.");
                String selection = scanner.nextLine();
                if (!(selection.equals("Y")) || !(selection.equals("y"))) {
                    willContinue = false;
                }
            }
            while(willContinue);

        System.out.println("************************************");
        System.out.println("Thanks for playing, hope you enjoyed the person builder!");




    }
}
