package com.example.exilo.android_r_gefry_rustam.Model;

import com.google.gson.annotations.SerializedName;

public class Penilaian {

    @SerializedName("nip")
    private String nip;
    @SerializedName("tahun")
    private String tahun;
    @SerializedName("bulan")
    private String bulan;
    @SerializedName("jumlah_hari_kerja")
    private String jumlah_hari_kerja;
    @SerializedName("hadir")
    private String hadir;
    @SerializedName("izin")
    private String izin;
    @SerializedName("sakit")
    private String sakit;
    @SerializedName("cuti")
    private String cuti;
    @SerializedName("tanpa_alasan_sah")
    private String tanpa_alasan_sah;
    @SerializedName("terlambat")
    private String terlambat;
    @SerializedName("cepat_pulang")
    private String cepat_pulang;
    @SerializedName("uwas")
    private String uwas;
    @SerializedName("upacara")
    private String upacara;
    @SerializedName("wirid")
    private String wirid;
    @SerializedName("apel")
    private String apel;
    @SerializedName("senam")
    private String senam;
    @SerializedName("orientasi_pelayanan")
    private String orientasi_pelayanan;
    @SerializedName("integritas")
    private String integritas;
    @SerializedName("kerja_sama")
    private String kerja_sama;
    @SerializedName("kepemimpinan")
    private String kepemimpinan;
    @SerializedName("lkh")
    private String lkh;
    @SerializedName("sop")
    private String sop;
    @SerializedName("skp")
    private String skp;


    public Penilaian(){}

    public Penilaian(String nip, String tahun, String bulan,String jumlah_hari_kerja,String hadir
            ,String izin,String sakit,String cuti,String tanpa_alasan_sah,String terlambat
            ,String cepat_pulang,String uwas,String upacara,String wirid
            ,String apel,String senam,String orientasi_pelayanan,String integritas
            ,String kerja_sama,String kepemimpinan,String lkh,String sop
            ,String skp) {
        this.nip = nip;
        this.tahun = tahun;
        this.bulan = bulan;
        this.jumlah_hari_kerja = jumlah_hari_kerja;
        this.hadir = hadir;
        this.izin = izin;
        this.sakit = sakit;
        this.cuti = cuti;
        this.tanpa_alasan_sah = tanpa_alasan_sah;
        this.terlambat = terlambat;
        this.cepat_pulang = cepat_pulang;
        this.uwas = uwas;
        this.upacara = upacara;
        this.wirid = wirid;
        this.apel = apel;
        this.senam = senam;
        this.orientasi_pelayanan = orientasi_pelayanan;
        this.integritas = integritas;
        this.kerja_sama = kerja_sama;
        this.kepemimpinan = kepemimpinan;
        this.lkh = lkh;
        this.sop = sop;
        this.skp = skp;

    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
    }

    public String getJumlah_hari_kerja() {
        return jumlah_hari_kerja;
    }

    public void setJumlah_hari_kerja(String jumlah_hari_kerja) {
        this.jumlah_hari_kerja = jumlah_hari_kerja;
    }

    public String getHadir() {
        return hadir;
    }

    public void setHadir(String hadir) {
        this.hadir = hadir;
    }

    public String getIzin() {
        return izin;
    }

    public void setIzin(String izin) {
        this.izin = izin;
    }

    public String getSakit() {
        return sakit;
    }

    public void setSakit(String sakit) {
        this.sakit = sakit;
    }

    public String getCuti() {
        return cuti;
    }

    public void setCuti(String cuti) {
        this.cuti = cuti;
    }

    public String getTanpa_alasan_sah() {
        return tanpa_alasan_sah;
    }

    public void setTanpa_alasan_sah(String tanpa_alasan_sah) {
        this.tanpa_alasan_sah = tanpa_alasan_sah;
    }

    public String getTerlambat() {
        return terlambat;
    }

    public void setTerlambat(String terlambat) {
        this.terlambat = terlambat;
    }

    public String getCepat_pulang() {
        return cepat_pulang;
    }

    public void setCepat_pulang(String cepat_pulang) {
        this.cepat_pulang = cepat_pulang;
    }

    public String getUwas() {
        return uwas;
    }

    public void setUwas(String uwas) {
        this.uwas = uwas;
    }

    public String getUpacara() {
        return upacara;
    }

    public void setUpacara(String upacara) {
        this.upacara = upacara;
    }

    public String getWirid() {
        return wirid;
    }

    public void setWirid(String wirid) {
        this.wirid = wirid;
    }

    public String getApel() {
        return apel;
    }

    public void setApel(String apel) {
        this.apel = apel;
    }

    public String getSenam() {
        return senam;
    }

    public void setSenam(String senam) {
        this.senam = senam;
    }

    public String getOrientasi_pelayanan() {
        return orientasi_pelayanan;
    }

    public void setOrientasi_pelayanan(String orientasi_pelayanan) {
        this.orientasi_pelayanan = orientasi_pelayanan;
    }

    public String getIntegritas() {
        return integritas;
    }

    public void setIntegritas(String integritas) {
        this.integritas = integritas;
    }

    public String getKerja_sama() {
        return kerja_sama;
    }

    public void setKerja_sama(String kerja_sama) {
        this.kerja_sama = kerja_sama;
    }

    public String getKepemimpinan() {
        return kepemimpinan;
    }

    public void setKepemimpinan(String kepemimpinan) {
        this.kepemimpinan = kepemimpinan;
    }

    public String getLkh() {
        return lkh;
    }

    public void setLkh(String lkh) {
        this.lkh = lkh;
    }

    public String getSop() {
        return sop;
    }

    public void setSop(String sop) {
        this.sop = sop;
    }

    public String getSkp() {
        return skp;
    }

    public void setSkp(String skp) {
        this.skp = skp;
    }
}
