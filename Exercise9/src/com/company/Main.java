package com.company;

class ExceptionThrows{
    static String NullPointerException(){
        return null;
    }


}
public class Main {
    public static void main(String[] args) {

        try {
              ExceptionThrows.NullPointerException().toString();
        }
        catch (NullPointerException x){

            x.printStackTrace();
        }
    }
}

