package io.zipcoder.Pets;

public class Lion extends Pet {

    @Override
    public String speak() {
        return "rawr!";
    }

    public Lion(String name) {
        super(name);
    }

    public Lion(){

    }

    public int compareTo(Pet o) {
        return 0;
    }
}
