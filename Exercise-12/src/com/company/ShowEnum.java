package com.company;



enum ShapeType{
    SQUARE, RECTANGLE, CIRCLE, TRAPEZIUM, RHOMBUS, TRIANGLE, OVAL, HEXAGON
}

public class ShowEnum {
    public static void main(String[] args){
        for(ShapeType s : ShapeType.values()){
            System.out.println(s + " for the value" + s.ordinal() + "\n");
        }
    }
}
