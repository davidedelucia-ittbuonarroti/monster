package com.company;
import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner input = new Scanner(System.in);
        String nome;
        int hp;
        System.out.println("Inserisci il nome del primo mostro: ");
        nome = input.nextLine();
        System.out.println("Inserisci i punti vita massimi del primo mostro: ");
        hp = input.nextInt();
        Monster m1 = new Monster(nome, hp);
        System.out.println("Inserisci il nome del secondo mostro: ");
        nome = input.nextLine();
        System.out.println("Inserisci i punti vita massimi del secondo mostro: ");
        hp = input.nextInt();
        Monster m2 = new Monster(nome, hp);

        while(m1.vivo || m2.vivo){

        }
    }
}
