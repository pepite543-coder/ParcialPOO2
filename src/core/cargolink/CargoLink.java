/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.cargolink;

import core.cargolink.logisticscenter.LogisticsCenter;
import core.cargolink.vehicle.Vehicle;

import java.util.ArrayList;
/**
 *
 * @author valbuenas
 */
public class CargoLink {


private ArrayList<Client> client;
private ArrayList<LogisticsCenter> centers;
private ArrayList<Vehicle> vehicles; 

    public CargoLink() {
        this.client = new ArrayList<>();
        this.centers = new ArrayList<>();
        this.vehicles = new ArrayList<>();
    }
    
        public boolean addClient(Client client) {
        if (!this.client.contains(client)) {
            this.client.add(client);
            return true;
        }
        return false;
    }
        
        public boolean addLogisticsCenter(LogisticsCenter center) {
        if (!this.centers.contains(center)) {
            this.centers.add(center);
            return true;
        }
        return false;
    }
        
        public boolean addVehicle(Vehicle vehicle) {
        if (!this.vehicles.contains(vehicle)) {
            this.vehicles.add(vehicle);
            return true;
        }
        return false;
    }

    public Client getClient(int index){
        return clients.get(index);
    }

    public LogisticsCenter getLogisticsCenter(int index){
        return centers.get(index);
    }
    
    public Vehicle getVehicle(int index){
        return vehicles.get(index);
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

}
