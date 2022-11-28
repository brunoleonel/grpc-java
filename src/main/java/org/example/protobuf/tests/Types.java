package org.example.protobuf.tests;

import org.example.protobuf.models.common.BodyType;
import org.example.protobuf.models.common.Car;
import org.example.protobuf.models.dealer.Dealer;

public class Types {

    public static void main(String[] args) {

        var corolla = Car.newBuilder()
                .setBrand("Toyota")
                .setModel("Corolla")
                .setBodyType(BodyType.SEDAN)
                .build();

        var civic = Car.newBuilder()
                .setBrand("Honda")
                .setModel("Civic")
                .setBodyType(BodyType.HATCHBACK)
                .build();

        var model = Dealer.newBuilder()
                .putModel(1L, corolla)
                .putModel(2L, civic)
                .build();

        System.out.println(model);
        System.out.println(model.
                getModelOrDefault(1L, civic)
                .getBodyType());
    }
}
