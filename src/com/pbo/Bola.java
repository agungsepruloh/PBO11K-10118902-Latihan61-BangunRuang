package com.pbo;

public class Bola extends BangunRuang {

    private static final double PHI = 3.14;
    private double jariJari;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungVolume() {
        return jariJari * PHI * 4 / 3;
    }
}
