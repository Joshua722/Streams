package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ArrayList<Person> Person = new ArrayList<>();
        Scanner myScanner = new Scanner(System.in);
        Person.add(new Person("Bobby","Ramond",16));
        Person.add(new Person("Blake","Smith",12));
        Person.add(new Person("David","Appleseed",15));
        Person.add(new Person("Alice", "Johnson", 18));
        Person.add(new Person("Eva", "Martinez", 14));
        Person.add(new Person("Samuel", "Nguyen", 17));
        Person.add(new Person("Olivia", "Williams", 13));
        Person.add(new Person("Daniel", "Garcia", 16));
        Person.add(new Person("Sophia", "Taylor", 14));

            ArrayList<Person> matchedPerson = new ArrayList<>();
            System.out.println("Search for a first name : ");
            String firstName = myScanner.nextLine().trim();
            System.out.println("Search for a last name : ");
            String lastName = myScanner.nextLine().trim();

            for(Person p : Person){
                if(firstName.equalsIgnoreCase(p.getFirstName()) && lastName.equalsIgnoreCase(p.getLastName())){
                    matchedPerson.add(p);
                    System.out.println(p.getFirstName() + " " + p.getLastName() + " " + p.getAge());
                }
            }
            int total = 0;
            for(Person p : Person){
                total += p.getAge();
            }
        int i = total / Person.size();
        System.out.println("This is the average " + i);
        Person oldestPerson = null;
        int maxAge = Integer.MIN_VALUE;

        for(Person person : Person){
            if(person.getAge() > maxAge){
                maxAge = person.getAge();
                oldestPerson = person;
            }
        }
        if(oldestPerson != null){
            System.out.println("The oldest person is: " + oldestPerson.getFirstName());
        }

        Person youngestPerson = null;
        int minAge = Integer.MAX_VALUE;

        for(Person person : Person){
            if(person.getAge() < minAge){
                minAge = person.getAge();
                youngestPerson = person;
            }
        }
        if(youngestPerson != null){
            System.out.println("The youngest person is: " + youngestPerson.getFirstName());
        }



    }
}
