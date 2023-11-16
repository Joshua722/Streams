package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Scanner myScanner = new Scanner(System.in);
        people.add(new Person("Bobby", "Ramond", 16));
        people.add(new Person("Blake", "Smith", 12));
        people.add(new Person("David", "Appleseed", 15));
        people.add(new Person("Alice", "Johnson", 18));
        people.add(new Person("Eva", "Martinez", 14));
        people.add(new Person("Samuel", "Nguyen", 17));
        people.add(new Person("Olivia", "Williams", 13));
        people.add(new Person("Daniel", "Garcia", 16));
        people.add(new Person("Sophia", "Taylor", 14));

        ArrayList<Person> matchedPerson = new ArrayList<>();
        System.out.println("Search for a first name : ");
        String firstName = myScanner.nextLine().trim();
        System.out.println("Search for a last name : ");
        String lastName = myScanner.nextLine().trim();

        List<Person> matching = people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(firstName) || person.getLastName().equalsIgnoreCase(lastName))
                .collect(Collectors.toList());

        matching.forEach(person -> {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getAge());
        });

        int averageAge = (int) people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0.0);
        System.out.println("The average age is : " + averageAge);

        int oldestAge = people.stream()
                .mapToInt(Person::getAge)
                .max()
                .orElse(0);
        int youngestAge = people.stream()
                .mapToInt(Person::getAge)
                .min()
                .orElse(0);
        System.out.println("The oldest age is : " + oldestAge);
        System.out.println("The youngest age is : " + youngestAge);


//            for(Person p : Person){
//                if(firstName.equalsIgnoreCase(p.getFirstName()) && lastName.equalsIgnoreCase(p.getLastName())){
//                    matchedPerson.add(p);
//                    System.out.println(p.getFirstName() + " " + p.getLastName() + " " + p.getAge());
//                }
//            }
//            int total = 0;
//            for(Person p : Person){
//                total += p.getAge();
//            }
//        int i = total / Person.size();
//        System.out.println("This is the average " + i);
//        Person oldestPerson = null;
//        int maxAge = Integer.MIN_VALUE;
//
//        for(Person person : Person){
//            if(person.getAge() > maxAge){
//                maxAge = person.getAge();
//                oldestPerson = person;
//            }
//        }
//        if(oldestPerson != null){
//            System.out.println("The oldest person is: " + oldestPerson.getFirstName());
//        }
//
//        Person youngestPerson = null;
//        int minAge = Integer.MAX_VALUE;
//
//        for(Person person : Person){
//            if(person.getAge() < minAge){
//                minAge = person.getAge();
//                youngestPerson = person;
//            }
//        }
//        if(youngestPerson != null){
//            System.out.println("The youngest person is: " + youngestPerson.getFirstName());
//        }


    }
}
