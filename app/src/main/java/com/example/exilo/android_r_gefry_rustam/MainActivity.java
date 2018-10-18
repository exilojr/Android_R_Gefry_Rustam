package com.example.exilo.android_r_gefry_rustam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.exilo.android_r_gefry_rustam.Adapter.PegawaiAdapter;
import com.example.exilo.android_r_gefry_rustam.Model.GetPegawai;
import com.example.exilo.android_r_gefry_rustam.Model.Pegawai;
import com.example.exilo.android_r_gefry_rustam.Rest.ApiClient;
import com.example.exilo.android_r_gefry_rustam.Rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    Button btIns;
    ApiInterface mApiInterface;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public static MainActivity ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btIns = (Button) findViewById(R.id.btIns);
        btIns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, InsertPegawai.class));
            }
        });
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        ma=this;
        refresh();
    }

    public void refresh() {
        Call<GetPegawai> pegawaiCall = mApiInterface.getPegawai();
        pegawaiCall.enqueue(new Callback<GetPegawai>() {
            @Override
            public void onResponse(Call<GetPegawai> call, Response<GetPegawai>
                    response) {
                List<Pegawai> PegawaiList = response.body().getListDataPegawai();
                Log.d("Retrofit Get", "Jumlah data Kontak: " +
                        String.valueOf(PegawaiList.size()));
                mAdapter = new PegawaiAdapter(PegawaiList);
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<GetPegawai> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });
    }


}
