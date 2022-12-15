package sk.holic.prvypolrok.zoo;

import java.util.Scanner;

public class Application {



    public static void main(String[] args) {


        String mojaZoo;
        String chovatel;
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Toto je moje Zoo");
        System.out.println("Zadaj názov Zoo");
        System.out.println("Zadaj Meno Chovatela");
        String menoChovatela = scanner.nextLine();
        chovatel = new chovatel(menoChovatela);
        mojaZoo = scanner.nextLine();

    }



}
