package com.example.exilo.android_r_gefry_rustam.Model;

import com.google.gson.annotations.SerializedName;

public class PostPutDelPegawai {
    @SerializedName("status")
    String status;
    @SerializedName("values")
    Pegawai mPegawai;
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
    public Pegawai getPegawai() {
        return mPegawai;
    }
    public void setmPegawai(Pegawai Pegawai) {
        mPegawai = Pegawai;
    }
}
