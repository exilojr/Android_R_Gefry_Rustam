package com.example.exilo.android_r_gefry_rustam.Model;

import com.google.gson.annotations.SerializedName;

public class Pegawai {

    @SerializedName("nip")
    private String nip;
    @SerializedName("nama")
    private String nama;
    @SerializedName("pangkat")
    private String pangkat;
    @SerializedName("jabatan")
    private String jabatan;

    public Pegawai(){}

    public Pegawai(String nip, String nama, String pangkat,String jabatan) {
        this.nip = nip;
        this.nama = nama;
        this.pangkat = pangkat;
        this.jabatan = jabatan;
    }

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

    public String getPangkat() {
        return pangkat;
    }

    public void setPangkat(String pangkat) {
        this.pangkat = pangkat;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

}
