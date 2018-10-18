package com.example.exilo.android_r_gefry_rustam.Model;

import com.google.gson.annotations.SerializedName;

public class PostPutDelPenilaian {

    @SerializedName("status")
    String status;
    @SerializedName("values1")
    Penilaian mPenilaian;
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
    public Penilaian getmPenilaian() {
        return mPenilaian;
    }
    public void setmPenilaian(Penilaian Penilaian) {
        mPenilaian = Penilaian;
    }
}
