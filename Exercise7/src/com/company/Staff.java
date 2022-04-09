package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staff extends Person{
    String educationYILDIRIM56462;
    String positionYILDIRIM56462;



    void initialize1YILDIRIM56462() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        initializeYILDIRIM56462();
        System.out.print("Please enter your education: ");
        educationYILDIRIM56462 = br.readLine();
        System.out.print("Please enter your position: ");
        positionYILDIRIM56462 = br.readLine();
    }
    void print1YILDIRIM56462(){
        System.out.println("Education: "+educationYILDIRIM56462);
        System.out.println("Position: "+positionYILDIRIM56462);
    }
}
