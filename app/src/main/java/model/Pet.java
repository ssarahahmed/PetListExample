package model;

public class Pet {
    private String name;
    private String breed;
    private int age;


    @Override
    public String toString(){
        return  name + "(" + breed + "): " + age;
    }
}
