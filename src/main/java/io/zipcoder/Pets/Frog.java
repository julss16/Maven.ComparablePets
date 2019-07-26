package io.zipcoder.Pets;

public class Frog extends Pet {

    @Override
    public String speak() {
        return "ribbit";
    }

    public Frog(String name) {
        super(name);
    }

    public Frog(){

    }

    public int compareTo(Pet o) {
        return 0;
    }
}
