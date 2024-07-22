package com.example.airlinesys;

public class reservationView {
    private String FlightNo;
    private String dep_from;
    private String arrive_at;

    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private String name;
    private String cnic;
    private String address;

    public String getFlightNo() {
        return FlightNo;
    }

    public void setFlightNo(String flightNo) {
        FlightNo = flightNo;
    }

    public String getDep_from() {
        return dep_from;
    }

    public void setDep_from(String dep_from) {
        this.dep_from = dep_from;
    }

    public String getArrive_at() {
        return arrive_at;
    }

    public void setArrive_at(String arrive_at) {
        this.arrive_at = arrive_at;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public reservationView(String date,String flightNo, String dep_from, String arrive_at, String name, String cnic, String address) {
        this.date=date;
        this.FlightNo = flightNo;
        this.dep_from = dep_from;
        this.arrive_at = arrive_at;
        this.name = name;
        this.cnic = cnic;
        this.address = address;
    }
}
