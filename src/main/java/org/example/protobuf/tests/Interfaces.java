package org.example.protobuf.tests;

import org.example.protobuf.models.common.Credentials;
import org.example.protobuf.models.common.EmailCredentials;
import org.example.protobuf.models.common.PhoneOtp;

public class Interfaces {

    public static void main(String[] args) {
        var email = EmailCredentials.newBuilder()
                .setEmail("teste@teste.com")
                .setPassword("test")
                .build();

        var credentials = Credentials.newBuilder()
                .setEmailMode(email)
                .build();

        login(credentials);

        var phone = PhoneOtp.newBuilder()
                .setPhoneNumber("12222222")
                .setCode("122")
                .build();

        var credentials2 = Credentials.newBuilder()
                .setPhoneMode(phone)
                .build();

        login(credentials2);
    }

    public static void login(Credentials credentials) {
        System.out.println(credentials);
    }
}
