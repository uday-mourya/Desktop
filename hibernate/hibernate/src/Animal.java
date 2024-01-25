/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class Animal {
    private int animalId;
    private String species;
    private String name;
    private int age;
    private String color;
    private double weight;

    // Default constructor
    public Animal() {
    }

    // Parameterized constructor
    public Animal(int animalId, String species, String name, int age, String color, double weight) {
        this.animalId = animalId;
        this.species = species;
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    // Getters and Setters

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // toString method for easy debugging

    @Override
    public String toString() {
        return "Animal{" +
                "animalId=" + animalId +
                ", species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}

