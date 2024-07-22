package com.example.airlinesys;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

public abstract class person implements Serializable{

    private String name;
    private String address;
    private String cnic;
    private String contactnum;


    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getContactnum() {
        return contactnum;
    }

    public void setContactnum(String contactnum) {
        this.contactnum = contactnum;
    }

    @Override
    public String toString() {
        return "customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cnic='" + cnic + '\'' +
                ", contactnum='" + contactnum + '\'' +
                ", count=" + count +
                '}';
    }



    public abstract void addingrecord(ArrayList<customer> a) throws IOException;

    public abstract ArrayList readingRecord() throws IOException;

}