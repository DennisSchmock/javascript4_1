/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dennis
 */
public class Person {

    private String name;
    private static List<Person> persons = new ArrayList();
    private static int counter;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        persons.add(new Person("Dennis Schmock"));
        persons.add(new Person("1Dennis Schmock"));
        persons.add(new Person("2Dennis Schmock"));
        persons.add(new Person("3Dennis Schmock"));
        persons.add(new Person("4Dennis Schmock"));
        persons.add(new Person("5Dennis Schmock"));
        persons.add(new Person("6Dennis Schmock"));
        persons.add(new Person("7Dennis Schmock"));
        persons.add(new Person("8Dennis Schmock"));
        persons.add(new Person("9Dennis Schmock"));
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the persons
     */
    public List<Person> getPersons() {
        return persons;
    }

    /**
     * @param persons the persons to set
     */
    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public void addPerson(String name) {
        persons.add(new Person(name));
    }

    public Person loadPerson() {
        if (counter < persons.size()) {
            Person p = persons.get(persons.size() - (persons.size() - counter));
            counter++;
            return p;
        } else {
            
           Person p = persons.get(0);
            counter =1;
            return p;
        }
    }

}
