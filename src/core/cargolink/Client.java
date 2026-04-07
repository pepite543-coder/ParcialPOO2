/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.cargolink;


import core.cargolink.logisticscenter.Shipping;

import java.util.ArrayList;

/**
 *
 * @author aforerod
 */
public class Client {


    private int id;
    private String name;
    private String address;
    private String email;
    private ArrayList<Shipping> shippings;
    
        public Client(int id, String name, String address, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
         this.shippings = new ArrayList<>();
        this.shippings.add(Shipping);
    }
        
    public boolean addJuego(Shipping shipping) {
        if (!this.shippings.contains(shipping)) {
            this.shippings.add(shipping);
            return true;
        }
        return false;
    }

    public Shipping getShipping(int index) {
        return shippings.get(index);
    }

    public ArrayList<Shipping> getShippings() {
        return shippings;
    }

    public String getShipping(String s00001) {
        return "";
    }
    
    
}
