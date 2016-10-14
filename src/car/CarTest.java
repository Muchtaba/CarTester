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
public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Nissan", "GTR", "Black", "AWD", 2017, 307.385, 111585);
        Car car2 = new Car("BMW", "335xi", "Black", "AWD", 2009, 249.448, 11990);
        Car car3 = new Car();

        //Print the details of each car
        System.out.println(car1.toString());
        System.out.println("--------------------------");

        System.out.println(car2.toString());
        System.out.println("--------------------------");

        System.out.println(car3);
        System.out.println("--------------------------");
    }
}
