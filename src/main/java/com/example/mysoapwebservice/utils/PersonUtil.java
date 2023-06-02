package com.example.mysoapwebservice.utils;

import com.example.mysoapwebservice.entity.Person;

import java.util.HashMap;
import java.util.Map;

public class PersonUtil {
    private static final Map<Integer, Person> map;

    static {
        map = new HashMap<Integer, Person>();
        map.put(1, new Person(1, "Josh Muleshi"));
        map.put(2, new Person(2, "Excellence Kawej"));
        map.put(3, new Person(3, "Yves Kalume"));
        map.put(4, new Person(4, "Urcilla Katembwe"));
        map.put(5, new Person(5, "Ornella Samba"));
    }

    private PersonUtil() {
    }

    public static Person getPerson(Integer id) {
        return map.get(id);
    }

    public static Integer getPersonNember(){
        return map.size();
    }
}
