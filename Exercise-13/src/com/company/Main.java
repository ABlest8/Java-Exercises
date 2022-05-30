package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String > employee = new ArrayList<String>();
        Scanner sc = new Scanner(new File("src/com/company/text.txt"));

        while (sc.hasNext()){
            employee.add(sc.nextLine());
        }
        sc.close();

        System.out.println(employee.size()+" employees was recorded");
    }
}
