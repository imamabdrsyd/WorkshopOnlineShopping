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
 * @author Administrator
 */
public class PerhitunganDao {

    private Double asuransi = 0.05;
    //Paket paket;
    private Paket paket;
    private double totalOngkir;
    private String kota;
    private int berat;
    
    public PerhitunganDao() {
        System.out.println("Konek PD");
    }

    public double hargaReg() {
        List<Paket> paketLibs = TarifDao.paketLib();
        double biaya = 0.0;
        double total=0.0;
        for (Paket paket1 : paketLibs) {

            if (kota.equalsIgnoreCase(paket1.getTujuan())) {
                if (paket.getLayanan().equalsIgnoreCase("Reguler")) {
                    setTotalOngkir(Double.parseDouble(paket1.getReguler())*berat);
                    biaya = getTotalOngkir();
                    if(paket.getAsuransi().equalsIgnoreCase("Ya")){
                        total=biaya+(paket.getHargabarang()*asuransi);
                    }else if(paket.getAsuransi().equalsIgnoreCase("Tidak")){
                        total=biaya;
                    }
                }
                if(paket.getLayanan().equalsIgnoreCase("Kilat")){
                    setTotalOngkir(Double.parseDouble(paket1.getKilat())*berat);
                    biaya=getTotalOngkir();
                    if(paket.getAsuransi().equalsIgnoreCase("Ya")){
                        total=biaya+(paket.getHargabarang()*asuransi);
                    }else if(paket.getAsuransi().equalsIgnoreCase("Tidak")){
                        total=biaya;
                    }
                }
                if(paket.getLayanan().equalsIgnoreCase("SDS")){
                    setTotalOngkir(Double.parseDouble(paket1.getSds())*berat);
                    biaya=getTotalOngkir();
                    if(paket.getAsuransi().equalsIgnoreCase("Ya")){
                        total=biaya+(paket.getHargabarang()*asuransi);
                    }else if(paket.getAsuransi().equalsIgnoreCase("Tidak")){
                        total=biaya;
                    }
                }
                if(paket.getLayanan().equalsIgnoreCase("ONS")){
                    setTotalOngkir(Double.parseDouble(paket1.getOns())*berat);
                    biaya=getTotalOngkir();
                    if(paket.getAsuransi().equalsIgnoreCase("Ya")){
                        total=biaya+(paket.getHargabarang()*asuransi);
                    }else if(paket.getAsuransi().equalsIgnoreCase("Tidak")){
                        total=biaya;
                    }
                }
                if(paket.getLayanan().equalsIgnoreCase("HDS")){
                    setTotalOngkir(Double.parseDouble(paket1.getHds())*berat);
                    biaya=getTotalOngkir();
                    if(paket.getAsuransi().equalsIgnoreCase("Ya")){
                        total=biaya+(paket.getHargabarang()*asuransi);
                    }else if(paket.getAsuransi().equalsIgnoreCase("Tidak")){
                        total=biaya;
                    }
                }
            }
        }
        return total;
    }


    /**
     * @return the totalOngkir
     */
    public double getTotalOngkir() {
        return totalOngkir;
    }

    /**
     * @param totalOngkir the totalOngkir to set
     */
    public void setTotalOngkir(double totalOngkir) {
        this.totalOngkir = totalOngkir;
    }

    /**
     * @return the paket
     */
    public Paket getPaket() {
        return paket;
    }

    /**
     * @param paket the paket to set
     */
    public void setPaket(Paket paket) {
        this.paket = paket;
    }

    /**
     * @return the kota
     */
    public String getKota() {
        return kota;
    }

    /**
     * @param kota the kota to set
     */
    public void setKota(String kota) {
        this.kota = kota;
    }

    /**
     * @return the berat
     */
    public int getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(int berat) {
        this.berat = berat;
    }

}
