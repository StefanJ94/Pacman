package com.example.awtSample.igra;

import com.example.awtSample.jedinice.Brzina;
import com.example.awtSample.jedinice.Lokacija;

public abstract class Neprijatelj extends PokretanObjekat{
    private double snaga = 0;
    private double zivot = 0;


    public Neprijatelj(Lokacija lokacija, String slika, Brzina brzina) {
        super(lokacija, slika, brzina);
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
