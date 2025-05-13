package Semester2.OOP1.Lesson2.LightSimolator;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        TrafficLight[] trafficLight = new TrafficLight[4];
        trafficLight[0] = new TrafficLight(2, 0);
        trafficLight[1] = new TrafficLight(2, 2000);
        trafficLight[2] = new TrafficLight(2, 4000);
        trafficLight[3] = new TrafficLight(2, 6000);


        Car[] cars = new Car[20];
        for (int i = 0; i < 20; i++) {
            cars[i] = new Car();
        }

        new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println(cars[0]);
                System.out.println(trafficLight[0]);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < cars.length; i++) {
                for (int j = 0; j < trafficLight.length; j++) {
                    while (true){
                        if (cars[i].getMeterPassed() == trafficLight[j].getDistanceFromStart()){
                            if (trafficLight[j].isGreenLight()){
                                cars[i].drive();
                            } else {
                                cars[i].setIsMoving(false);
                            }
                        } else {
                            cars[i].drive();
                        }
                        if (cars[i].getMeterPassed() > trafficLight[j].getDistanceFromStart()){
                            break;
                        }
                    }
                    System.out.println(cars[i]);
                    System.out.println(trafficLight[j]);
                }
            }
        }).start();


    }
}
