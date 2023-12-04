/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;
// Java program demonstrate how to Sort TreeSet using
// Comparable interface in descending order

import java.util.*;

// Student class implements comparable interface
class Student implements Comparable<Student> {

	Integer marks;

	Student(Integer marks) 
        { 
            this.marks = marks; 
        }

	// override toString method
	public String toString() 
        { 
            return (" " + this.marks); 
        }

	// Override compareTo method to sort TreeSet in
	// descending order
	public int compareTo(Student stu)
	{
		return stu.marks.compareTo(this.marks);
	}
}

class desending {
	public static void main(String[] args)
	{

		// New TreeSet
		TreeSet<Student> set = new TreeSet<>();

		// Adding elements to the set
		set.add(new Student(500));
		set.add(new Student(300));
		set.add(new Student(400));
		set.add(new Student(100));
		set.add(new Student(200));

		// Print TreeSet sorted in descending order
		System.out.println("Sort elements in descending order : " + set);
	
	}
}

