package com.fikri.model;

import com.fikri.dao.PerhitunganDao;
import java.util.Date;

public class Paket {

    private String nopaket;
    private String tujuan;
    private String jenisbarang;
    private double berat;
    private Date tglkirim;
    private double dimensi;
    private String layanan;
    private String asuransi;
    private double hargabarang;
    private String reguler;
    private String kilat;
    private String sds;
    private String ons;
    private String hds;
    private String waktu;
    private PerhitunganDao pd;

    public Paket() {
        System.out.println("Konek Paket");
    }

    public Paket(String tujuan) {

    }

    public Paket(String nopaket, String tujuan) {
        this.nopaket = nopaket;
        this.tujuan = tujuan;

    }

    public Paket(String nopaket, String tujuan, String jenisbarang) {
        this.nopaket = nopaket;
        this.tujuan = tujuan;
        this.jenisbarang = jenisbarang;

    }

    public Paket(String nopaket, String tujuan, String jenisbarang, double berat) {
        this.nopaket = nopaket;
        this.tujuan = tujuan;
        this.jenisbarang = jenisbarang;
        this.berat = berat;

    }

    public Paket(String nopaket, String tujuan, String jenisbarang, double berat, Date tglkirim) {
        this.nopaket = nopaket;
        this.tujuan = tujuan;
        this.jenisbarang = jenisbarang;
        this.berat = berat;
        this.tglkirim = tglkirim;

    }

    public Paket(String nopaket, String tujuan, String jenisbarang, double berat, Date tglkirim, double dimensi) {
        this.nopaket = nopaket;
        this.tujuan = tujuan;
        this.jenisbarang = jenisbarang;
        this.berat = berat;
        this.tglkirim = tglkirim;
        this.dimensi = dimensi;

    }

    public Paket(String nopaket, String tujuan, String jenisbarang, double berat, Date tglkirim, double dimensi, String layanan) {
        this.nopaket = nopaket;
        this.tujuan = tujuan;
        this.jenisbarang = jenisbarang;
        this.berat = berat;
        this.tglkirim = tglkirim;
        this.dimensi = dimensi;
        this.layanan = layanan;

    }

    public Paket(String nopaket, String tujuan, String jenisbarang, double berat, Date tglkirim, double dimensi, String layanan, String asuransi) {
        this.nopaket = nopaket;
        this.tujuan = tujuan;
        this.jenisbarang = jenisbarang;
        this.berat = berat;
        this.tglkirim = tglkirim;
        this.dimensi = dimensi;
        this.layanan = layanan;
        this.asuransi = asuransi;

    }

    public Paket(String nopaket, String tujuan, String jenisbarang, double berat, Date tglkirim, double dimensi, String layanan, String asuransi, double hargabarang) {
        this.nopaket = nopaket;
        this.tujuan = tujuan;
        this.jenisbarang = jenisbarang;
        this.berat = berat;
        this.tglkirim = tglkirim;
        this.dimensi = dimensi;
        this.layanan = layanan;
        this.asuransi = asuransi;
        this.hargabarang = hargabarang;
    }

    /**
     * @return the nopaket
     */
    public String getNopaket() {
        return nopaket;
    }

    /**
     * @param nopaket the nopaket to set
     */
    public void setNopaket(String nopaket) {
        this.nopaket = nopaket;
    }

    /**
     * @return the tujuan
     */
    public String getTujuan() {
        return tujuan;
    }

    /**
     * @param tujuan the tujuan to set
     */
    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    /**
     * @return the jenisbarang
     */
    public String getJenisbarang() {
        return jenisbarang;
    }

    /**
     * @param jenisbarang the jenisbarang to set
     */
    public void setJenisbarang(String jenisbarang) {
        this.jenisbarang = jenisbarang;
    }

    /**
     * @return the berat
     */
    public double getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(double berat) {
        this.berat = berat;
    }

    /**
     * @return the tglkirim
     */
    public Date getTglkirim() {
        return tglkirim;
    }

    /**
     * @param tglkirim the tglkirim to set
     */
    public void setTglkirim(Date tglkirim) {
        this.tglkirim = tglkirim;
    }

    /**
     * @return the dimensi
     */
    public double getDimensi() {
        return dimensi;
    }

    /**
     * @param dimensi the dimensi to set
     */
    public void setDimensi(double dimensi) {
        this.dimensi = dimensi;
    }

    /**
     * @return the layanan
     */
    public String getLayanan() {
        return layanan;
    }

    /**
     * @param layanan the layanan to set
     */
    public void setLayanan(String layanan) {
        this.layanan = layanan;
    }

    /**
     * @return the asuransi
     */
    public String getAsuransi() {
        return asuransi;
    }

    /**
     * @param asuransi the asuransi to set
     */
    public void setAsuransi(String asuransi) {
        this.asuransi = asuransi;
    }

    /**
     * @return the hargabarang
     */
    public double getHargabarang() {
        return hargabarang;
    }

    /**
     * @param hargabarang the hargabarang to set
     */
    public void setHargabarang(double hargabarang) {
        this.hargabarang = hargabarang;
    }

    /**
     * @return the reguler
     */
    public String getReguler() {
        return reguler;
    }

    /**
     * @param reguler the reguler to set
     */
    public void setReguler(String reguler) {
        this.reguler = reguler;
    }

    /**
     * @return the kilat
     */
    public String getKilat() {
        return kilat;
    }

    /**
     * @param kilat the kilat to set
     */
    public void setKilat(String kilat) {
        this.kilat = kilat;
    }

    /**
     * @return the sds
     */
    public String getSds() {
        return sds;
    }

    /**
     * @param sds the sds to set
     */
    public void setSds(String sds) {
        this.sds = sds;
    }

    /**
     * @return the ons
     */
    public String getOns() {
        return ons;
    }

    /**
     * @param ons the ons to set
     */
    public void setOns(String ons) {
        this.ons = ons;
    }

    /**
     * @return the hds
     */
    public String getHds() {
        return hds;
    }

    /**
     * @param hds the hds to set
     */
    public void setHds(String hds) {
        this.hds = hds;
    }

    /**
     * @return the waktu
     */
    public String getWaktu() {
        return waktu;
    }

    /**
     * @param waktu the waktu to set
     */
    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    @Override
    public String toString() {
        return this.getTujuan();
    }

    /**
     * @return the pd
     */
    public PerhitunganDao getPd() {
        return pd;
    }

    /**
     * @param pd the pd to set
     */
    public void setPd(PerhitunganDao pd) {
        this.pd = pd;
    }

}
