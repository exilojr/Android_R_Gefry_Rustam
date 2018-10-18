package com.example.exilo.android_r_gefry_rustam.Adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.exilo.android_r_gefry_rustam.EditPegawai;
import com.example.exilo.android_r_gefry_rustam.Model.Pegawai;
import com.example.exilo.android_r_gefry_rustam.R;

import java.util.List;

public class PegawaiAdapter extends RecyclerView.Adapter<PegawaiAdapter.MyViewHolder>{
    List<Pegawai> mPegawaiList;

    public PegawaiAdapter(List <Pegawai> PegawaiList) {
        mPegawaiList = PegawaiList;
    }

    @Override
    public MyViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.pegawai_list, parent, false);
        MyViewHolder mViewHolder = new MyViewHolder(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder (MyViewHolder holder,final int position){
        holder.mTextViewNip.setText("Id = " + mPegawaiList.get(position).getNip());
        holder.mTextViewNama.setText("Nama = " + mPegawaiList.get(position).getNama());
        holder.mTextViewPangkat.setText("Pangkat = " + mPegawaiList.get(position).getPangkat());
        holder.mTextViewJabatan.setText("Jabatan = " + mPegawaiList.get(position).getJabatan());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(view.getContext(), EditPegawai.class);
                mIntent.putExtra("Nip", mPegawaiList.get(position).getNip());
                mIntent.putExtra("Nama", mPegawaiList.get(position).getNama());
                mIntent.putExtra("Pangkat", mPegawaiList.get(position).getPangkat());
                mIntent.putExtra("Jabatan", mPegawaiList.get(position).getJabatan());
                view.getContext().startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount () {
        return mPegawaiList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewNip, mTextViewNama, mTextViewPangkat,mTextViewJabatan;

        public MyViewHolder(View itemView) {
            super(itemView);
            mTextViewNip = (TextView) itemView.findViewById(R.id.tvNip);
            mTextViewNama = (TextView) itemView.findViewById(R.id.tvNama);
            mTextViewPangkat = (TextView) itemView.findViewById(R.id.tvPangkat);
            mTextViewJabatan = (TextView) itemView.findViewById(R.id.tvJabatan);
        }
    }
}