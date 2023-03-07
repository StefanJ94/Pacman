package com.example.awtSample;

public class Main {

    public static void main(String[] args) {

        prikaziPredjeniPut(Brzina.fromKilometersPerHour(110),Vreme.fromMinutes(4));
        prikaziPredjeniPut(Brzina.fromMetersPerSecond(4),Vreme.fromHours(4));

    }


    public static void prikaziPredjeniPut(Brzina brzina, Vreme vreme) {
        Put p = Put.fromMeters(brzina.toMetersPerSecond() * vreme.toSeconds());

        System.out.println("Predjeni put je: " + p.toKilometers() + "km");

    }
}
