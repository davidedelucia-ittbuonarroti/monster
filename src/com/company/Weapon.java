package com.company;

public class Weapon {
    private boolean equipped;
    private int arma;

    public Weapon(int danni){
        arma = danni;
        equipped = false;
    }

    //raccogli
    public void raccogli(){
        equipped = true;
    }

    //lascia
    public void lascia(){
        equipped = false;
    }

    //getEquipped
    public boolean isEquipped(){
        return equipped;
    }
}
