package com.pbo;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * NIM   : 10118902
 * Kelas : IF-11K
 * Deskripsi Program : program ini berguna untuk menghitung volume dari bangun ruang
 *
 */

public class Main {

    public static void main(String[] args) {
	    Bola bola = new Bola();
        bola.setJariJari(7);
        System.out.println(String.format("Jari -jari bola\t = %.2f", bola.getJariJari()));
        System.out.println(String.format("Volume bola\t\t = %.2f", bola.hitungVolume()));

        Tabung tabung = new Tabung();
        tabung.setJariJari(10);
        tabung.setTinngi(21);
        System.out.println();
        System.out.println(String.format("Jari-jari Tabung\t = %.2f", tabung.getJariJari()));
        System.out.println(String.format("Tinggi Tabung\t\t = %.2f", tabung.getTinngi()));
        System.out.println(String.format("Volume Tabung\t\t = %.2f", tabung.hitungVolume()));

        Kerucut kerucut = new Kerucut();
        kerucut.setJariJari(14);
        kerucut.setTinggi(9);
        System.out.println();
        System.out.println(String.format("Jari-jari Kerucut\t = %.2f", kerucut.getJariJari()));
        System.out.println(String.format("Tinggi Kerucut\t\t = %.2f", kerucut.getTinggi()));
        System.out.println(String.format("Volume Kerucut\t\t = %.2f", kerucut.hitungVolume()));
    }
}
