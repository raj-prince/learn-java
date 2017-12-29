package com.external.prince;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializer {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("person.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person person = (Person) ois.readObject();
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
