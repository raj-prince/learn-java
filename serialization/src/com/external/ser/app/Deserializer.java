package com.external.ser.app;

import com.external.ser.obj.Person;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializer {
    public static void main(String[] args) {
        try {
            // Read the serialized object from the file.
            FileInputStream fis = new FileInputStream("person.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Need to typecaste because ois.readObject() returns Object.
            Person person = (Person) ois.readObject();

            // It will print the value of object, which are serialized using Serializer.java class.
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
