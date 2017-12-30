package com.external.ser.obj;


import java.io.Serializable;

public class Person implements Serializable {

    // Required at the time of serialization or deserialization.
    static final long serialVersionUID = 395409196047199046L;

    // Stores the name of the person.
    String name;

    // Stores the age of the person.
    int age;

    // Person's pet animal.
    Animal pet;

    public Person(String name, int age, Animal pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return pet != null ? pet.equals(person.pet) : person.pet == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (pet != null ? pet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
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

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }
}
