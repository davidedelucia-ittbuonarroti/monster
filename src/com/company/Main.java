package com.company;
import javax.xml.bind.SchemaOutputResolver;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        String nome;
        int hp, i = 1, scelta;
        System.out.println("Inserisci il nome del primo mostro: ");
        nome = input.nextLine();
        input = new Scanner(System.in);
        System.out.println("Inserisci i punti vita massimi del primo mostro: ");
        hp = input.nextInt();
        Monster m1 = new Monster(nome, hp);
        System.out.println("Inserisci il nome del secondo mostro: ");
        input = new Scanner(System.in);
        nome = input.nextLine();
        System.out.println("Inserisci i punti vita massimi del secondo mostro: ");
        hp = input.nextInt();
        Monster m2 = new Monster(nome, hp);

        while(m1.vivo() || m2.vivo()){
            if(i%2 == 0){
                System.out.println(menu());
                do{
                    scelta = input.nextInt();
                } while(scelta <0 || scelta>2);
                switch(scelta) {
                    case 1:
                        try {
                            m1.cura(r.nextInt(m1.getPuntiFerita()/4));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    case 2:
                        try {
                            m1.attacca(m2);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                }
            } else {
                System.out.println(menu());
                do{
                    scelta = input.nextInt();
                } while(scelta >0 || scelta>2);
                switch(scelta) {
                    case 1:
                        try {
                            m1.cura(r.nextInt(m1.getPuntiFerita()/4));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    case 2:
                        try {
                            m1.attacca(m2);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                }
            }
            i++;
            System.out.println(m1.toString());
            System.out.println(m2.toString());
        }
        System.out.println("\n\n");
        System.out.println(m1.toString());
        System.out.println(m2.toString());


    }
    public static  String menu(){
        String str =
                "1) Cura il mostro" +
                "2) Attacca il mostro avversario";
        return str;
    }
}
