package com.company;
import java.util.Random;

public class Monster {
    private String nome;
    private int puntiFerita;
    private int danno;

    //costruttore
    public Monster(String nome, int puntiFerita){
        Random r = new Random();
        this.nome = nome;
        this.puntiFerita = puntiFerita;
        this.danno = r.nextInt(puntiFerita);
    }
    //metodo attacco
    //metodo subisci
    //toString
    //git push origin main
}
