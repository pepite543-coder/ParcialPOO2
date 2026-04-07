/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.cargolink.vehicle;

import core.cargolink.logisticscenter.Shipping;
import java.util.ArrayList;

/**
 *
 * @author valbuenas
 */
public abstract class Vehicle  {
    
    protected double cargoCapacity;
    protected ArrayList<Shipping> shippings;

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public ArrayList<Shipping> getShippings() {
        return shippings;
    }

    public Vehicle(double cargoCapacity, ArrayList<Shipping> shippings) {
        this.cargoCapacity = cargoCapacity;
        this.shippings = shippings;
        
    }
    
    
}
