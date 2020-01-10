package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {

    @Id
    private int aID;
    private String aname;
    private String tech;

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aID=" + aID +
                ", aName='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }

    public int getaID() {
        return aID;
    }

    public void setaID(int aID) {
        this.aID = aID;
    }

    public String getaName() {
        return aname;
    }

    public void setaName(String aName) {
        this.aname = aName;
    }
}
