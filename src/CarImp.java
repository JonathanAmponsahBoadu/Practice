/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class CarImp {
    public static void main(String[] args) {
        Car C1 = new Car("Toyota", "Corolla", 2020, "Blue");
        Car C2 = new Car( "Ford", "Mustang", 2021, "Red");
        Car C3 = new Car("BMW","X5",2022,"Black");

        C1.displayInfo();
        C2.displayInfo();
        C3.displayInfo();
    }
}
