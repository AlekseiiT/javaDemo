package com.aleksey.tarasov.lesson1;

import com.aleksey.tarasov.lesson2.Name;

public class Person {

    private Name personName;

    public Person(Name personName) {
        this.personName = personName;
    }

    public Person(){
        /*
         Empty on purpose
         */
    }

    public String helloWorld() {
        return "Hello World";
    }

    public String hello(String name){
        return "Hello " + name;
    }
}
