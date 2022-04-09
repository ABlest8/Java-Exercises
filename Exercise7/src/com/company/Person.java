package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    String surnameYILDIRIM56462;
    String firstnameYILDIRIM56462;
    String streetYILDIRIM56462;
    int zipcodeYILDIRIM56462;
    String cityYILDIRIM56462;



    void initializeYILDIRIM56462()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter your name: ");
        firstnameYILDIRIM56462 = br.readLine();
        System.out.print("Please enter your lastname: ");
        surnameYILDIRIM56462 = br.readLine();
        System.out.print("Please enter your street: ");
        streetYILDIRIM56462 = br.readLine();
        System.out.print("Please enter your zipCode: ");
        zipcodeYILDIRIM56462 = Integer.parseInt(br.readLine());
        System.out.print("Please enter your city: ");
        cityYILDIRIM56462 = br.readLine();
    }
    void printYILDIRIM56462(){
        System.out.println("Name: " + firstnameYILDIRIM56462);
        System.out.println("Lastname: " + surnameYILDIRIM56462);
        System.out.println("Street: " + streetYILDIRIM56462);
        System.out.println("Zipcode: " + zipcodeYILDIRIM56462);
        System.out.println("City: " + cityYILDIRIM56462);
    }
}
