package com.example.airlinesys;

import java.io.*;
import java.util.ArrayList;

public class reservation implements Serializable{

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

    public  void addReservation(ArrayList<reservation> d) throws IOException {


        try {
            System.out.println("1");
            FileOutputStream file=new FileOutputStream("Reservation.dat");

            ObjectOutputStream fos = new ObjectOutputStream(file);


            fos.writeObject(d);
            System.out.println("okay");

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


    }

    public ArrayList  readReservation() throws IOException {
        try {
            System.out.println("in method file handling");
            File yourFile = new File("Reservation.dat");
            if(yourFile.exists()){
                System.out.println("in method 1 file handling");
                FileInputStream oFile = new FileInputStream(yourFile);
                ObjectInputStream ois = new ObjectInputStream(oFile);
                System.out.println("in method 2");

                ArrayList<reservation> pArr = (ArrayList<reservation>) ois.readObject();
                System.out.println("in method 3");
                System.out.println(pArr);
                System.out.println("************* FILE OVERWRITTEN *************\n");
                return (pArr);
            }
            else{
                System.out.println("in method3");
                return new ArrayList<reservation>();
            }
//        yourFile.createNewFile(); // if file already exists will do nothing

        } catch (ClassNotFoundException ex) {
            System.out.println("cant read file");
            throw new RuntimeException(ex);
        }
    }

    @Override
    public String toString() {
        return "reservation{" +
                "FlightNo='" + FlightNo + '\'' +
                ", dep_from='" + dep_from + '\'' +
                ", arrive_at='" + arrive_at + '\'' +
                ", date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", cnic='" + cnic + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
