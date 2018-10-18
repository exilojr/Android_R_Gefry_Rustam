package com.example.exilo.android_r_gefry_rustam.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetPenilaian {
    @SerializedName("status")
    String status;
    @SerializedName("values1")
    List<Penilaian> listDataPenilaian;
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
    public List<Penilaian> getListDataPenilaian() {
        return listDataPenilaian;
    }
    public void setListDataPenilaiani(List<Penilaian> listDataPegawai) {
        this.listDataPenilaian = listDataPegawai;
    }
}
