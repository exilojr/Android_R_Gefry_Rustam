package com.example.exilo.android_r_gefry_rustam.Rest;

import com.example.exilo.android_r_gefry_rustam.Model.GetPegawai;
import com.example.exilo.android_r_gefry_rustam.Model.PostPutDelPegawai;
import com.example.exilo.android_r_gefry_rustam.Model.PostPutDelPenilaian;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiInterface {
    @GET("restpegawai")
    Call<GetPegawai> getPegawai();
    @FormUrlEncoded
    @POST("restpegawai/store")
    Call<PostPutDelPegawai> postPegawai(@Field("nip") String nip,
                                        @Field("nama") String nama,
                                        @Field("pangkat") String pangkat,
                                        @Field("jabatan") String jabatan);
    @FormUrlEncoded
    @PUT("restpegawai")
    Call<PostPutDelPegawai> putPegawai( @Field("nip") String nip,
                                        @Field("nama") String nama,
                                        @Field("pangkat") String pangkat,
                                        @Field("jabatan") String jabatan);
    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "restpegawai", hasBody = true)
    Call<PostPutDelPegawai> deletePegawai(@Field("nip") String nip);

    @FormUrlEncoded
    @POST("restpenilaian/show")
    Call<PostPutDelPenilaian> postPenilaian(@Field("nip") String nip);


}
