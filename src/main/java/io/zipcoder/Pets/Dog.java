package io.zipcoder.Pets;

public class Dog extends Pet {

    @Override
    public String speak() {
        return "roof";
    }

    public Dog(String name) {
        super(name);
    }

    public Dog(){

    }

    public int compareTo(Pet o) {
        return 0;
    }
}
