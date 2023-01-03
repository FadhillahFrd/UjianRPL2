/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Model {
    private String nip;
    private String nama;
    private String jabatan;
    private boolean jenkel;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public boolean isJenkel() {
        return jenkel;
    }

    public void setJenkel(boolean jenkel) {
        this.jenkel = jenkel;
    }
    
    public Model(String nip, String nama, String jabatan, boolean jenkel){
        this.nip = nip;
        this.nama = nama;
        this.jabatan = jabatan;
        this.jenkel = jenkel;
    }
}