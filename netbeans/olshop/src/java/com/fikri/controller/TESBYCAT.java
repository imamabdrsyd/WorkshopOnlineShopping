/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fikri.controller;

import com.fikri.dao.ProductService;
import com.fikri.model.Product;
import java.util.List;

/**
 *
 * @author user
 */
public class TESBYCAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProductService ps = new ProductService();
        List<Product> prods = ps.findAll();
        
        for (Product prod : prods) {
            System.out.println("Prod: " + prod.getDescription()+ " "+prod.getCost());
        }
    }
    
}
