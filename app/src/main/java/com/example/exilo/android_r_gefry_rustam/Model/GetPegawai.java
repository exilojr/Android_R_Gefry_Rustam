package com.example.exilo.android_r_gefry_rustam.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetPegawai {

    @SerializedName("status")
    String status;
    @SerializedName("values")
    List<Pegawai> listDataPegawai;
    @SerializedName("message")
    String message;
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public List<Pegawai> getListDataPegawai() {
        return listDataPegawai;
    }
    public void setListDataPegawai(List<Pegawai> listDataPegawai) {
        this.listDataPegawai = listDataPegawai;
    }
}
