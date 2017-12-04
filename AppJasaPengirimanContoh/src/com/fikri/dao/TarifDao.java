package com.fikri.dao;

import com.fikri.model.Paket;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class TarifDao {

    public static List <Paket>paketLib(){
                
            List<Paket>libs=new ArrayList<>();
            try {
            Scanner scan=new Scanner(new File("D:/bootcampjava/AppJasaPengirimanContoh/fileTarif.txt"));
            while(scan.hasNextLine()){
                String line=scan.nextLine();
                String[]data=line.split(",");
                Paket cost=new Paket();    
            
                cost.setTujuan(data[0]);
                cost.setReguler(data[1]);
                cost.setKilat(data[2]);
                cost.setSds(data[3]);
                cost.setOns(data[4]);
                cost.setHds(data[5]);
                    
                libs.add(cost);
            
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TarifDao.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        return libs;
    }

}
