/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author T460
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}

public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] people = new Person[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name for person " + (i + 1) + ": ");
            String name = sc.nextLine();

            System.out.print("Enter age for person " + (i + 1) + ": ");
            int age = sc.nextInt();
            sc.nextLine();  

            people[i] = new Person(name, age);
        }

        Arrays.sort(people, new PersonAgeComparator());
        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge() + " years old");
        }
    }
}
