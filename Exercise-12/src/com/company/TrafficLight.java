package com.company;

enum TrafficLihtColor{
    RED, GREEN, YELLOW
}
class TrafficLightSimulator{
    TrafficLihtColor tlc = TrafficLihtColor.RED;

    public void changeColor(){
        switch (tlc){
            case RED ->
                    tlc = TrafficLihtColor.YELLOW;
            case YELLOW ->
                    tlc = TrafficLihtColor.GREEN;
            case GREEN ->
                    tlc = TrafficLihtColor.RED;
        }
    }
    public String toString() {return " "+ tlc;}
}

public class TrafficLight {
    public static void main(String[] args) {
        TrafficLightSimulator t1 = new TrafficLightSimulator();
        for(int i = 0; i<9; i++){
            System.out.println(t1);
            t1.changeColor();
        }
    }
}
