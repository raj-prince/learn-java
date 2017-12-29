package com.external.prince;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Serializer {

    public static void main(String[] args) {
        Animal animal = new Animal("Dog", 10);
        Person person = new Person("Prince", 21, animal);
        try {
            FileOutputStream fos = new FileOutputStream("person.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
