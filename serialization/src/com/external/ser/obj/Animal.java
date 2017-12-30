package com.external.ser.obj;

import java.io.Serializable;

public class Animal implements Serializable {

    // Required at the time of serialization and deserialization.
    // We can find it using: serialver -classpath <classpath> . <fully specified class name>
    static final long serialVersionUID = 3444581603015690609L;

    // Stores name of the animal.
    String name;

    // Stores age of the animal.
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        return name != null ? name.equals(animal.name) : animal.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
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
}
