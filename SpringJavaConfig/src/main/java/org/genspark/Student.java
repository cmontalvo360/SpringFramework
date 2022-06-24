package org.genspark;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;
    public Student(int id, String name, List<Phone> ph, Address add) {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.add = add;
    }
    public void shout() {
        System.out.println("my id: " + id +
                        " \nnmy name: " + name +
                        " \nphone numbers: " + ph +
                        " \nmy address: " + add);
    }
}
