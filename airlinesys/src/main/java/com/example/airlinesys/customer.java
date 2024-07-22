package com.example.airlinesys;


import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class customer extends person{



@Override
    public  void addingrecord(ArrayList<customer> a) throws IOException {


try {

    FileOutputStream file=new FileOutputStream("Customer.dat");

    ObjectOutputStream fos = new ObjectOutputStream(file);


    fos.writeObject(a);


} catch (IOException ex) {
    throw new RuntimeException(ex);
}


    }
@Override
public ArrayList  readingRecord() throws IOException {
    try {
        System.out.println("in method");
        File yourFile = new File("Customer.dat");
        if(yourFile.exists()){
            System.out.println("in method 1");
            FileInputStream oFile = new FileInputStream(yourFile);
            ObjectInputStream ois = new ObjectInputStream(oFile);
            System.out.println("in method 2");

            ArrayList<customer> pArr = (ArrayList<customer>) ois.readObject();
            System.out.println(pArr);
            System.out.println("************* FILE OVERWRITTEN *************\n");
            return (pArr);
        }
        else{
            System.out.println("in method3");
            return new ArrayList<customer>();
        }


    } catch (ClassNotFoundException ex) {
        System.out.println("cant read file");
        throw new RuntimeException(ex);
    }
}


}

