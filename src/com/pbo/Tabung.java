package com.pbo;

public class Tabung extends BangunRuang {

    private static final double PHI = 3.14;
    private double jariJari;
    private double tinngi;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getTinngi() {
        return tinngi;
    }

    public void setTinngi(double tinngi) {
        this.tinngi = tinngi;
    }

    @Override
    public double hitungVolume() {
        return PHI * Math.pow(jariJari, 2) * tinngi;
    }
}
