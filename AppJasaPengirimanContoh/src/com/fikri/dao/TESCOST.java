/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fikri.dao;

import com.fikri.model.Paket;
import java.util.List;

/**
 *
 * @author user
 */
public class TESCOST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Paket>paketLib=TarifDao.paketLib();
        Paket pkt=new Paket();
        pkt.setBerat(10.0);
         for (Paket pakets : paketLib) {
             if (pakets.getTujuan().equalsIgnoreCase("Semarang")) {
                  double cost = pkt.getBerat()*Double.parseDouble(pakets.getReguler());
        System.out.println("Biaya Reguler: " + cost);
             }
        
   
       
        }
       
    }
    
}
