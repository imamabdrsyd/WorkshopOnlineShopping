package com.fikri.controller;

import com.fikri.model.Product;
import java.util.Date;

public class OrderFormBean {

    private double total;
    private Date tanggal;
    private Product description;

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the tanggal
     */
    public Date getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    /**
     * @return the description
     */
    public Product getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(Product description) {
        this.description = description;
    }
    
}
