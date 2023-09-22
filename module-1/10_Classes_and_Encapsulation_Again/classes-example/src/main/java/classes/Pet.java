package classes;

public class Pet {
    //properties
    private String type;
    private String name;

    //constructor
    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    //getters & setters
    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getType() {
        return this.type;
    }

    //TODO: answer this question: can a pet's species ("type") be changed, if nothing about the code in this class changes?



}
