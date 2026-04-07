/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.cargolink.Vehicle;

import core.cargolink.logisticscenter.Shipping;
import core.cargolink.vehicle.Vehicle;
import java.util.ArrayList;



    

public class Truck extends Vehicle {
   private String licensePlate;

    public Truck(double cargoCapacity, ArrayList<Shipping> shippings) {
        super(cargoCapacity, shippings);
    }
   

}
