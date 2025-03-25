package com.example;

import com.google.gson.Gson;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Gson gson = new Gson();

        Person person = new Person("Alice", 25);
        String json = gson.toJson(person);
        System.out.println("Json:"+ json);

        Person person2 = gson.fromJson(json, Person.class);
        System.out.println("Parsed person:"+person2.name+", "+person2.age );
    }
}
