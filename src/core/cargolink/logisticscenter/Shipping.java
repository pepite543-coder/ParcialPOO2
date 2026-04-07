/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.cargolink.logisticscenter;
import core.Vehicle.Vehicle;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author valbuenas
 */
public class Shipping {
private String code;
private Client client;
private String originCenter; 
private String destinationCenter;
private Date registrationDate;
private Date deliveryDate;
private Status status;
private ArrayList<Package> packages;
private Vehicle vehicle;   
}
