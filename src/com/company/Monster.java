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
    public void attacca(Monster m){
        m.subisci(danno);
    }
    //metodo subisci
    public void subisci(int danniSubiti){
        puntiFerita -= danniSubiti;
    }

    //toString
    public String toString(){
        return nome +" -> " +puntiFerita +"HP   " + danno +"Attack Damage";
    }
    //git push origin main
}
