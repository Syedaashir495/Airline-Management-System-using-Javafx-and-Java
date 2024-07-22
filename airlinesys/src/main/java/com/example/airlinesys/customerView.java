package com.example.airlinesys;

public class customerView {
    public customerView(String id, String name, String cnic, String number, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cnic = cnic;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCnic() {
        return cnic;
    }

    public String getNumber() {
        return number;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String id;
    private String name;
    private String address;
    private String cnic;
    private String number;
}
