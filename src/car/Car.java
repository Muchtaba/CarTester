/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author mukaz1657
 */
public class Car {

    private String carMake, carModel, carColor, carDriveTrain;
    private int carYear;
    private double carTopSpeed, carPrice;

    public Car() {
        carMake = "BMW";
        carModel = "323i";
        carColor = "Black";
        carYear = 2009;
        carDriveTrain = "RWD";
        carPrice = 12930;
        carTopSpeed = 220;
    }

    public Car(String crMake, String crModel, String crColor, String crDriveTrain, int crYear, double crTopSpeed, double crPrice) {
        carMake = crMake;
        carModel = crModel;
        carColor = crColor;
        carYear = crYear;
        carPrice = crPrice;
        carTopSpeed = crTopSpeed;
        carDriveTrain = crDriveTrain;
    }

    public String toString() {
        String output = "Car make: " + carMake + "\n";
        output += "Car model: " + carModel + "\n";
        output += "Car color: " + carColor + "\n";
        output += "Car price: " + carPrice + "\n";
        output += "Car top speed: " + carTopSpeed + "\n";
        output += "Car drive train: " + carDriveTrain;
        //output string is complete, return it
        return output;
    }

}
