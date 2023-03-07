package com.example.awtSample.jedinice;

public class Lokacija {
    private Duzina x,y;

    public Lokacija(Duzina x, Duzina y) {
        this.x = x;
        this.y = y;
    }

    public Duzina getX() {
        return x;
    }

    public Duzina getY() {
        return y;
    }

    public void move(Ugao ugao, Duzina duzina) {
        // x' = x + duzina * cos(ugao)
        // y' = y + duzina * sin(ugao)
        x.add(Duzina.fromMeters(duzina.toMeters() * Math.cos(ugao.toRadians())));
        y.add(Duzina.fromMeters(duzina.toMeters() * Math.sin(ugao.toRadians())));

    }
}
