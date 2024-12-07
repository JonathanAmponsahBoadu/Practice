/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    public Car(String make,String model,int year,String color){
    this.make = make;
    this.model = model;
    this.year = year;
    this.color = color;
    }
    
    public void displayInfo(){
        System.out.println("Car manufacturer :" + make);
        System.out.println("Car model :" + model);
        System.out.println("Year of manufacture :" + year);
        System.out.println("Car color :" + color);
        System.out.println("\n\n");

};
}