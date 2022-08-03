/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.diminventory;
/**
 *
 * @author HP
 */


public class Inventory {
    private String itemName;
    private int numberOfItems;
    
    Inventory(){
    }
    
    
    Inventory( String itemName, int numberOfItems  ){
        this.numberOfItems = numberOfItems;
        this.itemName = itemName;
    }
    
    public String getItemName(){
        return this.itemName;
    }
    
    public void setNumberOfItems(int numberOfItems){
        this.numberOfItems = numberOfItems;
    }
    
    public void getItemsBack(int amount){
        this.numberOfItems = this.numberOfItems - amount;
    }
    
    public void addItems(int newItems){
        this.numberOfItems = this.numberOfItems + newItems;
    }
}
