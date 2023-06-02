package com.example.mysoapwebservice.service;

import com.example.mysoapwebservice.entity.Person;
import com.example.mysoapwebservice.utils.PersonUtil;

import javax.jws.WebService;
import java.util.List;
import java.util.Map;

@WebService(endpointInterface = "com.example.mysoapwebservice.service.PersonServiceI")
public class PersonServiceImpl implements PersonServiceI {

    @Override
    public Person getPerson(Integer id) {
        return PersonUtil.getPerson(id);
    }

    @Override
    public Integer getPersonNember() {
        return PersonUtil.getPersonNember();
    }

}