
package com.fikri.model;


public class Pengirim {
    private String namapengirim;
    private String alamatpengirim;
    private String kotapengirim;
    private String kodepospengirim;
    private String provinsipengirim;
    private String hppengirim;

    public Pengirim() {
    }
    public Pengirim(String namapengirim, String alamatpengirim){
        this.namapengirim=namapengirim;
        this.alamatpengirim=alamatpengirim;
    } 
    public Pengirim(String namapengirim, String alamatpengirim, String kotapengirim){
        this.namapengirim = namapengirim;
        this.alamatpengirim = alamatpengirim;
        this.kotapengirim = kotapengirim;
    }
    public Pengirim(String namapengirim, String alamatpengirim, String kotapengirim, String kodepospengirim){
        this.namapengirim = namapengirim;
        this.alamatpengirim = alamatpengirim;
        this.kotapengirim = kotapengirim;
        this.kodepospengirim = kodepospengirim;
        
    }
    public Pengirim(String namapengirim, String alamatpengirim, String kotapengirim, String kodepospengirim, String provinsipengirim){
        this.namapengirim = namapengirim;
        this.alamatpengirim = alamatpengirim;
        this.kotapengirim = kotapengirim;
        this.kodepospengirim = kodepospengirim;
        this.provinsipengirim = provinsipengirim;
        
    }
    public Pengirim(String namapengirim, String alamatpengirim, String kotapengirim, String kodepospengirim, String provinsipengirim, String hppengirim) {
        this.namapengirim = namapengirim;
        this.alamatpengirim = alamatpengirim;
        this.kotapengirim = kotapengirim;
        this.kodepospengirim = kodepospengirim;
        this.provinsipengirim = provinsipengirim;
        this.hppengirim = hppengirim;
    }

    /**
     * @return the namapengirim
     */
    public String getNamapengirim() {
        return namapengirim;
    }

    /**
     * @param namapengirim the namapengirim to set
     */
    public void setNamapengirim(String namapengirim) {
        this.namapengirim = namapengirim;
    }

    /**
     * @return the alamatpengirim
     */
    public String getAlamatpengirim() {
        return alamatpengirim;
    }

    /**
     * @param alamatpengirim the alamatpengirim to set
     */
    public void setAlamatpengirim(String alamatpengirim) {
        this.alamatpengirim = alamatpengirim;
    }

    /**
     * @return the kotapengirim
     */
    public String getKotapengirim() {
        return kotapengirim;
    }

    /**
     * @param kotapengirim the kotapengirim to set
     */
    public void setKotapengirim(String kotapengirim) {
        this.kotapengirim = kotapengirim;
    }

    /**
     * @return the kodepospengirim
     */
    public String getKodepospengirim() {
        return kodepospengirim;
    }

    /**
     * @param kodepospengirim the kodepospengirim to set
     */
    public void setKodepospengirim(String kodepospengirim) {
        this.kodepospengirim = kodepospengirim;
    }

    /**
     * @return the provinsipengirim
     */
    public String getProvinsipengirim() {
        return provinsipengirim;
    }

    /**
     * @param provinsipengirim the provinsipengirim to set
     */
    public void setProvinsipengirim(String provinsipengirim) {
        this.provinsipengirim = provinsipengirim;
    }

    /**
     * @return the hppengirim
     */
    public String getHppengirim() {
        return hppengirim;
    }

    /**
     * @param hppengirim the hppengirim to set
     */
    public void setHppengirim(String hppengirim) {
        this.hppengirim = hppengirim;
    }
    
    
}
