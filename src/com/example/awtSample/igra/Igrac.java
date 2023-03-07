package com.example.awtSample.igra;

import com.example.awtSample.jedinice.Brzina;
import com.example.awtSample.jedinice.Lokacija;

public class Igrac extends PokretanObjekat {
    private String ime = "";
    private double snaga = 0;
    private double zivot = 0;

    public Igrac(Lokacija lokacija, String slika, Brzina brzina) {
        super(lokacija, slika, brzina);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getSnaga() {
        return snaga;
    }

    public void setSnaga(double snaga) {
        this.snaga = snaga;
    }

    public double getZivot() {
        return zivot;
    }

    public void setZivot(double zivot) {
        this.zivot = zivot;
    }
}
