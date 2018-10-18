package com.example.exilo.android_r_gefry_rustam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.exilo.android_r_gefry_rustam.Model.PostPutDelPegawai;
import com.example.exilo.android_r_gefry_rustam.Rest.ApiClient;
import com.example.exilo.android_r_gefry_rustam.Rest.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InsertPegawai extends AppCompatActivity {
    EditText edtNip,edtNama,edtJabatan;
    Button btInsert, btBack;
    String textPangkat;
    ApiInterface mApiInterface;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_pegawai);

        edtNip = (EditText) findViewById(R.id.edtNip);
        edtNama = (EditText) findViewById(R.id.edtNama);

        edtJabatan = (EditText) findViewById(R.id.edtJabatan);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.pangkat_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
         textPangkat = spinner.getSelectedItem().toString();

        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        btInsert = (Button) findViewById(R.id.btInserting);
        btInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call<PostPutDelPegawai> postPegawaiCall = mApiInterface.postPegawai(edtNip.getText().toString(),edtNama.getText().toString(), textPangkat, edtJabatan.getText().toString());
                postPegawaiCall.enqueue(new Callback<PostPutDelPegawai>() {
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

        btBack = (Button) findViewById(R.id.btBackGo);
        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.ma.refresh();
                finish();
            }
        });
    }
}
