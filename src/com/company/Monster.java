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
        this.danno = r.nextInt(puntiFerita/2);
    }
    //metodo attacco
    public void attacca(Monster m) throws Exception{
        try{
            m.subisci(danno);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }
    //metodo subisci
    public void subisci(int danniSubiti) throws Exception{
        if(vivo()){
            puntiFerita -= danniSubiti;
        } else {
            throw new Exception("Ha già sofferto abastanza!");
        }


    }

    //toString
    public String toString(){
        return nome +" -> " +puntiFerita +"HP   " + danno +"Attack Damage";
    }

    //ancora vivo??
    public boolean vivo(){
        boolean var = true;
        if(puntiFerita != 0){
            var = false;
        }
        return var;
    }
    //git push origin main
}
