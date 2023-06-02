package com.example.mysoapwebservice;

import com.example.mysoapwebservice.service.PersonServiceImpl;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {
        Endpoint ep = Endpoint.create(new PersonServiceImpl());
        ep.publish("http://127.0.0.1:8080/personServer");
    }
}
