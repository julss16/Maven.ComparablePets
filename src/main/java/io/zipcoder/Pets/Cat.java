package io.zipcoder.Pets;

public class Cat extends Pet{

    @Override
    public String speak() {
        return "meow!";
    }

    public Cat(String name) {
        super(name);
    }

    public Cat(){

    }

    public int compareTo(Pet o) {
        return 0;
    }
}
