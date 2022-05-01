package com.task2;

class Exceptions{
    static void Arithmetic(int a){
        int[] b = new int[4];
        try{
            int z = 5/a;
            b[a]=5;
        }
        catch (ArithmeticException c){
            System.out.println("You cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException c){
            System.out.println("There is no such index");
        }
        finally {
            System.out.println("All good");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i<5; i++){
            Exceptions.Arithmetic(i);
        }
    }
}
