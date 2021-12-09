package com.aleksey.tarasov.lesson1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld(){
        Person marcus = new Person();
        assertEquals("Hello World", marcus.helloWorld());
    }

    @Test
    public void shouldReturnHelloMarcus(){
        Person person = new Person();
        assertEquals("Hello Marcus", person.hello("Marcus"));
    }

    @Test
    public void numberOfPersons(){
        Person person1 = new Person();
        Person person2 = new Person();
        assertEquals(2, Person.numberOfPersons());
    }

}