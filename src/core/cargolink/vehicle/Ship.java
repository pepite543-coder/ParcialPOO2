/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.cargolink.vehicle;

import core.cargolink.logisticscenter.Shipping;
import java.util.ArrayList;

/**
 *
 * @author aforerod
 */
public class Ship extends Vehicle {
    private String name;

    public Ship(double cargoCapacity, ArrayList<Shipping> shippings) {
        super(cargoCapacity, shippings);
    }
}
