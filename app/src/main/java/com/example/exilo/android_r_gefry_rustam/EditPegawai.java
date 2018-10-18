package com.example.exilo.android_r_gefry_rustam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.exilo.android_r_gefry_rustam.Model.Pegawai;
import com.example.exilo.android_r_gefry_rustam.Model.Penilaian;
import com.example.exilo.android_r_gefry_rustam.Model.PostPutDelPegawai;
import com.example.exilo.android_r_gefry_rustam.Model.PostPutDelPenilaian;
import com.example.exilo.android_r_gefry_rustam.Rest.ApiClient;
import com.example.exilo.android_r_gefry_rustam.Rest.ApiInterface;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EditPegawai extends AppCompatActivity {

    EditText edtNip, edtNama, edtPangkat,edtJabatan;
    TextView tvtahun,tvbulan,tvjumlah_hari_kerja,tvhadir,tvizin,tvsakit,tvcuti,tvtanpa_alasan_sah,tvterlambat, tvcepat_pulang,tvuwas,tvupacara,tvwirid
            ,tvapel,tvsenam,tvorientasi_pelayanan,tvintegritas
            ,tvkerja_sama,tvkepemimpinan,tvlkh,tvsop
            ,tvskp;
    Button btUpdate, btDelete, btBack;
    ApiInterface mApiInterface;

    List<Penilaian> mPenilaianList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_pegawai);

        edtNip = (EditText) findViewById(R.id.edtNip);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtPangkat = (EditText) findViewById(R.id.edtPangkat);
        edtJabatan = (EditText) findViewById(R.id.edtJabatan);
        tvtahun = (TextView) findViewById(R.id.tvTahun);
        tvbulan = (TextView) findViewById(R.id.tvBulan);
        tvjumlah_hari_kerja = (TextView) findViewById(R.id.tvJumlah_Hari_Kerja);
        tvhadir = (TextView) findViewById(R.id.tvHadir);
        tvizin = (TextView) findViewById(R.id.tvIzin);
        tvsakit = (TextView) findViewById(R.id.tvSakit);
        tvcuti = (TextView) findViewById(R.id.tvCuti);
        tvtanpa_alasan_sah = (TextView) findViewById(R.id.tvTanpa_alasan_sah);
        tvterlambat = (TextView) findViewById(R.id.tvTerlambat);
        tvcepat_pulang = (TextView) findViewById(R.id.tvCepat_pulang);
        tvuwas = (TextView) findViewById(R.id.tvUWHS);
        tvupacara = (TextView) findViewById(R.id.tvUpacara);
        tvwirid = (TextView) findViewById(R.id.tvWirid);
        tvapel = (TextView) findViewById(R.id.tvApel);
        tvsenam = (TextView) findViewById(R.id.tvSenam);
        tvorientasi_pelayanan = (TextView) findViewById(R.id.tvOrientasi_pelayanan);
        tvintegritas = (TextView) findViewById(R.id.tvIntegritas);
        tvkerja_sama = (TextView) findViewById(R.id.tvKerja_sama);
        tvkepemimpinan = (TextView) findViewById(R.id.tvKepemimpinan);
        tvlkh = (TextView) findViewById(R.id.tvLKH);
        tvsop = (TextView) findViewById(R.id.tvSOP);
        tvskp = (TextView) findViewById(R.id.tvSKP);

        Intent mIntent = getIntent();
        edtNip.setText(mIntent.getStringExtra("Nip"));
        edtNip.setTag(edtNip.getKeyListener());
        edtNip.setKeyListener(null);
        edtNama.setText(mIntent.getStringExtra("Nama"));
        edtPangkat.setText(mIntent.getStringExtra("Pangkat"));
        edtJabatan.setText(mIntent.getStringExtra("Jabatan"));



        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        btUpdate = (Button) findViewById(R.id.btUpdate2);
        btUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call<PostPutDelPegawai> updatePegawaiCall = mApiInterface.putPegawai(
                        edtNip.getText().toString(),
                        edtNama.getText().toString(),
                        edtPangkat.getText().toString(),
                        edtJabatan.getText().toString());
                updatePegawaiCall.enqueue(new Callback<PostPutDelPegawai>() {
                    @Override
                    public void onResponse(Call<PostPutDelPegawai> call, Response<PostPutDelPegawai> response) {
                        MainActivity.ma.refresh();
                        finish();
                    }

                    @Override
                    public void onFailure(Call<PostPutDelPegawai> call, Throwable t) {
                        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
        btDelete = (Button) findViewById(R.id.btDelete2);
        btDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtNip.getText().toString().trim().isEmpty()==false){
                    Call<PostPutDelPegawai> deletePegawai = mApiInterface.deletePegawai(edtNip.getText().toString());
                    deletePegawai.enqueue(new Callback<PostPutDelPegawai>() {
                        @Override
                        public void onResponse(Call<PostPutDelPegawai> call, Response<PostPutDelPegawai> response) {
                            MainActivity.ma.refresh();
                            finish();
                        }

                        @Override
                        public void onFailure(Call<PostPutDelPegawai> call, Throwable t) {
                            Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
                        }
                    });
                }else{
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
                }
            }
        });
        btBack = (Button) findViewById(R.id.btBackGo);
        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.ma.refresh();
                finish();
            }
        });
        Nilai();
    }
    public void Nilai(){


        Call<PostPutDelPenilaian> postPenilaian = mApiInterface.postPenilaian(edtNip.getText().toString());
        postPenilaian.enqueue(new Callback<PostPutDelPenilaian>() {
            @Override
            public void onResponse(Call<PostPutDelPenilaian> call, Response<PostPutDelPenilaian> response) {
                Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
                Log.w("gson => ",new Gson().toJson(response));
                response.body().getmPenilaian().getTahun();

                if (response.body().getmPenilaian().getTahun()!=null) {
                    tvtahun.setText(response.body().getmPenilaian().getTahun());
                    tvbulan.setText(response.body().getmPenilaian().getBulan());
                    tvjumlah_hari_kerja.setText(response.body().getmPenilaian().getJumlah_hari_kerja());
                    tvhadir.setText(response.body().getmPenilaian().getHadir());
                    tvizin.setText(response.body().getmPenilaian().getIzin());
                    tvsakit.setText(response.body().getmPenilaian().getSakit());
                    tvcuti.setText(response.body().getmPenilaian().getCuti());
                    tvtanpa_alasan_sah.setText(response.body().getmPenilaian().getTanpa_alasan_sah());
                    tvterlambat.setText(response.body().getmPenilaian().getTerlambat());
                    tvcepat_pulang.setText(response.body().getmPenilaian().getCepat_pulang());
                    tvuwas.setText(response.body().getmPenilaian().getUwas());
                    tvupacara.setText(response.body().getmPenilaian().getUpacara());
                    tvwirid.setText(response.body().getmPenilaian().getWirid());
                    tvapel.setText(response.body().getmPenilaian().getApel());
                    tvsenam.setText(response.body().getmPenilaian().getSenam());
                    tvorientasi_pelayanan.setText(response.body().getmPenilaian().getOrientasi_pelayanan());
                    tvintegritas.setText(response.body().getmPenilaian().getIntegritas());
                    tvkerja_sama.setText(response.body().getmPenilaian().getKerja_sama());
                    tvkepemimpinan.setText(response.body().getmPenilaian().getKepemimpinan());
                    tvlkh.setText(response.body().getmPenilaian().getLkh());
                    tvsop.setText(response.body().getmPenilaian().getSop());
                    tvskp.setText(response.body().getmPenilaian().getSkp());
                }
            }

            @Override
            public void onFailure(Call<PostPutDelPenilaian> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
                Log.w("gson => ",t);
            }
        });
    }
}
