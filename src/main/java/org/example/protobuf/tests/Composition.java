package org.example.protobuf.tests;

import org.example.protobuf.models.common.Address;
import org.example.protobuf.models.common.Car;
import org.example.protobuf.models.person.Person;

import java.util.List;

public class Composition {

    public static void main(String[] args) {

        var address = Address.newBuilder()
                .setStreet("21 Jump Street")
                .setCity("New York")
                .build();

        var corolla = Car.newBuilder()
                .setBrand("Toyota")
                .setModel("Corolla")
                .build();

        var civic = Car.newBuilder()
                .setBrand("Honda")
                .setModel("Civic")
                .build();

        var person = Person.newBuilder()
                .setId(1L)
                .setName("James Woods")
                .setAddress(address)
                .addAllCar(List.of(corolla, civic))
                .build();

        System.out.println(person);
    }
}
