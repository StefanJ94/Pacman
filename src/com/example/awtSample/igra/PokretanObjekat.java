package com.example.awtSample.igra;

import com.example.awtSample.jedinice.Brzina;
import com.example.awtSample.jedinice.Lokacija;

public abstract class PokretanObjekat extends Objekat{

    private Brzina brzina;

    public PokretanObjekat(Lokacija lokacija, String slika, Brzina brzina) {
        super(lokacija, slika);
        this.brzina = brzina;
    }

    public Brzina getBrzina() {
        return brzina;
    }
}
