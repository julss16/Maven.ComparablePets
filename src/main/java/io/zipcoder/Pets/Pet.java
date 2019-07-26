package io.zipcoder.Pets;
import java.util.Comparator;

public abstract class Pet implements Comparable<Pet>{

    private String name;
    public abstract String speak();


    public Pet(String name){
        this.name= name;
    }

    public Pet(){
        this.name= "";
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name= name;
    }

    public int compareTo(Pet pet) {
        int compare = this.name.compareTo(pet.getName());
        return 0;
    }



}
