/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fikri.controller;

import com.fikri.model.Product;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author user
 */
public class CartBean {
    private double totalHarga;
    private Map<Integer, Product> cartList;

    public CartBean() {
        cartList=new HashMap<>();
    }
 
    public CartBean(Map<Integer, Product> cartList){
        this.cartList= cartList;
    }
    /**
     * @return the totalHarga
     */
    public double getTotalHarga() {
        return totalHarga;
    }

    /**
     * @param totalHarga the totalHarga to set
     */
    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    /**
     * @return the cartList
     */
    public Map<Integer, Product> getCartList() {
        return cartList;
    }

    /**
     * @param cartList the cartList to set
     */
    public void setCartList(Map<Integer, Product> cartList) {
        this.cartList = cartList;
    }
    
}
