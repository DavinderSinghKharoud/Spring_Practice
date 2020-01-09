package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {

    @Id
    private int aID;
    private String aName;

    @Override
    public String toString() {
        return "Alien{" +
                "aID=" + aID +
                ", aName='" + aName + '\'' +
                '}';
    }

    public int getaID() {
        return aID;
    }

    public void setaID(int aID) {
        this.aID = aID;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }
}