package com.example.mysoapwebservice.service;

import com.example.mysoapwebservice.entity.Person;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import java.util.Map;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface PersonServiceI {
    @WebMethod
    Person getPerson(Integer id);

    @WebMethod
    Integer getPersonNember();
}