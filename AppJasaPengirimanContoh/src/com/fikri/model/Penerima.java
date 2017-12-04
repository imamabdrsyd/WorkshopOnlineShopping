
package com.fikri.model;

public class Penerima {
private String namapenerima;
private String alamatpenerima;
private String kotapenerima;
private String kodepospenerima;
private String provinsipenerima;
private String hppenerima;

    public Penerima() {
    }

    public Penerima(String namapenerima, String alamatpenerima, String kotapenerima, String kodepospenerima, String provinsipenerima, String hppenerima) {
        this.namapenerima = namapenerima;
        this.alamatpenerima = alamatpenerima;
        this.kotapenerima = kotapenerima;
        this.kodepospenerima = kodepospenerima;
        this.provinsipenerima = provinsipenerima;
        this.hppenerima = hppenerima;
    }

    /**
     * @return the namapenerima
     */
    public String getNamapenerima() {
        return namapenerima;
    }

    /**
     * @param namapenerima the namapenerima to set
     */
    public void setNamapenerima(String namapenerima) {
        this.namapenerima = namapenerima;
    }

    /**
     * @return the alamatpenerima
     */
    public String getAlamatpenerima() {
        return alamatpenerima;
    }

    /**
     * @param alamatpenerima the alamatpenerima to set
     */
    public void setAlamatpenerima(String alamatpenerima) {
        this.alamatpenerima = alamatpenerima;
    }

    /**
     * @return the kotapenerima
     */
    public String getKotapenerima() {
        return kotapenerima;
    }

    /**
     * @param kotapenerima the kotapenerima to set
     */
    public void setKotapenerima(String kotapenerima) {
        this.kotapenerima = kotapenerima;
    }

    /**
     * @return the kodepospenerima
     */
    public String getKodepospenerima() {
        return kodepospenerima;
    }

    /**
     * @param kodepospenerima the kodepospenerima to set
     */
    public void setKodepospenerima(String kodepospenerima) {
        this.kodepospenerima = kodepospenerima;
    }

    /**
     * @return the provinsipenerima
     */
    public String getProvinsipenerima() {
        return provinsipenerima;
    }

    /**
     * @param provinsipenerima the provinsipenerima to set
     */
    public void setProvinsipenerima(String provinsipenerima) {
        this.provinsipenerima = provinsipenerima;
    }

    /**
     * @return the hppenerima
     */
    public String getHppenerima() {
        return hppenerima;
    }

    /**
     * @param hppenerima the hppenerima to set
     */
    public void setHppenerima(String hppenerima) {
        this.hppenerima = hppenerima;
    }


}
