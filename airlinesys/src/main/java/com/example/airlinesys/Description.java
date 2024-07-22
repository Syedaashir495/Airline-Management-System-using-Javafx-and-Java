package com.example.airlinesys;

import java.io.*;
import java.util.ArrayList;

public class Description implements Serializable{

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

    private int count;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public  void addDescription(ArrayList<Description> d) throws IOException {


        try {
            System.out.println("1");
            FileOutputStream file=new FileOutputStream("FlightDescription.dat");

            ObjectOutputStream fos = new ObjectOutputStream(file);


            fos.writeObject(d);
            System.out.println("okay");

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


    }

    public ArrayList  readDescription() throws IOException {
        try {
            System.out.println("in method");
            File yourFile = new File("FlightDescription.dat");
            if(yourFile.exists()){
                System.out.println("in method 1");
                FileInputStream oFile = new FileInputStream(yourFile);
                ObjectInputStream ois = new ObjectInputStream(oFile);
                System.out.println("in method 2");

                ArrayList<Description> pArr = (ArrayList<Description>) ois.readObject();
                System.out.println("in method 3");
                System.out.println(pArr);
                System.out.println("************* FILE OVERWRITTEN *************\n");
                return (pArr);
            }
            else{
                System.out.println("in method3");
                return new ArrayList<Description>();
            }
//        yourFile.createNewFile(); // if file already exists will do nothing

        } catch (ClassNotFoundException ex) {
            System.out.println("cant read file");
            throw new RuntimeException(ex);
        }
    }

    @Override
    public String toString() {
        return "Description{" +
                "FlightNo='" + FlightNo + '\'' +
                ", dep_from='" + dep_from + '\'' +
                ", arrive_at='" + arrive_at + '\'' +
                ", dep_time='" + dep_time + '\'' +
                ", arrive_time='" + arrive_time + '\'' +
                ", count=" + count +
                '}';
    }
}