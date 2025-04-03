package com.strategy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyMainApplication {

    public static void main(String[] args) {
        Vehicle vehicle= new OffRoadVehicle();
        vehicle.drive();

        Vehicle vehicle1= new GoodsVehicle();
        vehicle1.drive();


    }

}