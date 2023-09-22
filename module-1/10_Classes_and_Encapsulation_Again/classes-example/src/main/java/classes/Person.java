package classes;

import java.util.ArrayList;
import java.util.List;

public class Person {

    // properties - information about an object
    private String firstName;
    private String lastName;
    private int age;
    private String workplace;
    private List<Person> friends = new ArrayList<>(); //instantiate the list when the object is made, otherwise it will be null
    private List<Pet> pets = new ArrayList<>(); //instantiate the list when the object is made, otherwise it will be null

    //add a derived property to determine if the person can drink at tonight's happy hour
    public boolean getIsCanDrink() {
        //return this.age >= 21;
        if(this.age >= 21) {
            return true;
        }
        return false;
    }

    //constructors - 3 of them
    public Person() {};

    public Person(String first, String last, int age) {
        this.firstName = first;
        this.lastName = last;
        this.age = age;
    }

    //add a constructor that also sets the person's workplace when the object is instantiated
    public Person(String first, String last, int age, String workplace)
    {
        this.firstName = first;
        this.lastName = last;
        this.age = age;
        this.workplace = workplace;
    }

    //getters & setters
    public String getWorkplace() {
        return this.workplace;
    }

    public void setWorkplace(String companyName) {
        this.workplace = companyName;
    }

    public List<Person> getFriends() {
        return this.friends;
    }
    public List<Pet> getPets() {
        return this.pets;
    }

    //add getters and setters for first name and last name
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    //methods - behavior that an object can do
    public void haveBirthday() {
        this.age++;
    }

    public void addFriend(Person friend) {
        this.friends.add(friend);
    }

    public void addPet(Pet pet) {
        this.pets.add(pet);
    }

    //usually you will see 'toString' methods that just print out a new string-y version of the information in that object
    public String toString() {
        if(this.workplace != null) {
            return String.format("%s %s is %s years old, and they work at %s.", this.firstName, this.lastName, this.age, this.workplace);
        }
        return String.format("%s %s is %s years old.", this.firstName, this.lastName, this.age);
    }


}
