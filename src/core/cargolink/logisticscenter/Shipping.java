/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.cargolink.logisticscenter;
import core.cargolink.Client;
import core.cargolink.vehicle.Vehicle;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author valbuenas
 */
public class Shipping {
private String code;
private Client clients;
private String originCenter; 
private String destinationCenter;
private Date registrationDate;
private Date deliveryDate;
private Status status;
private ArrayList<Package> packages;
private Vehicle vehicle;   

  public Shipping(String code, Client client, String originCenter, String destinationCenter, Date registrationDate, Date deliveryDate, Status status, Vehicle vehicle) {
        this.code = code;
        this.client = client;
        this.originCenter = originCenter;
        this.destinationCenter = destinationCenter;
        this.registrationDate = registrationDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.vehicle = vehicle;
        packages = new ArrayList<>();
        
        this.client.add(Client);
    }

  public boolean addClient(Client client){
        if(!clients.contains(client)){
          clients.add(client);
          return true;
        }
        else return false;
    }
}
