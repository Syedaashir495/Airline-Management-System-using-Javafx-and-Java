package com.example.airlinesys;

public class DescriptionView {
    public DescriptionView(String date,String FlightNo, String dep_time, String dep_from, String arrive_at,String connecting, String arrive_time) {
     this.date=date;
        this.FlightNo = FlightNo;
        this.dep_from = dep_from;
        this.arrive_at = arrive_at;
        this.dep_time = dep_time;
        this.arrive_time = arrive_time;
        this.connecting=connecting;


    }




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

    public String getDep_time() {
        return dep_time;
    }

    public void setDep_time(String dep_time) {
        this.dep_time = dep_time;
    }

    public String getArrive_time() {
        return arrive_time;
    }

    public void setArrive_time(String arrive_time) {
        this.arrive_time = arrive_time;
    }
    public String getConnecting() {
        return connecting;
    }

    public void setConnecting(String connecting) {
        this.connecting = connecting;
    }



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

    private String dep_time;
    private String arrive_time;
    private String connecting;
}
