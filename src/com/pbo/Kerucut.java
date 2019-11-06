package com.pbo;

public class Kerucut extends BangunRuang {

    private static final double PHI = 3.14;
    private double jariJari;
    private double tinggi;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return PHI * Math.pow(jariJari, 2) * tinggi * 1 /3;
    }
}
