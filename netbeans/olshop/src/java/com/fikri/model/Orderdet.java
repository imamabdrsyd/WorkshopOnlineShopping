/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fikri.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "ORDERDET")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orderdet.findAll", query = "SELECT o FROM Orderdet o")
    , @NamedQuery(name = "Orderdet.findByOrderid", query = "SELECT o FROM Orderdet o WHERE o.orderid = :orderid")
    , @NamedQuery(name = "Orderdet.findByTotal", query = "SELECT o FROM Orderdet o WHERE o.total = :total")
    , @NamedQuery(name = "Orderdet.findByTanggal", query = "SELECT o FROM Orderdet o WHERE o.tanggal = :tanggal")})
public class Orderdet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORDERID")
    private Integer orderid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL")
    private Double total;
    @Column(name = "TANGGAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tanggal;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne(optional = false)
    private Product productId;
    public Orderdet() {
    }

    public Orderdet(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderid != null ? orderid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orderdet)) {
            return false;
        }
        Orderdet other = (Orderdet) object;
        if ((this.orderid == null && other.orderid != null) || (this.orderid != null && !this.orderid.equals(other.orderid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fikri.model.Orderdet[ orderid=" + orderid + " ]";
    }

    /**
     * @return the productId
     */
    public Product getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(Product productId) {
        this.productId = productId;
    }
    
}
