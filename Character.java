package br.unirio.bs1.tp2.dojo2.teste3;
import java.util.Scanner;

abstract public class Character {

    protected String name;
    protected int  chooseHability;
    protected String  hability;
    protected Scanner scanner = new Scanner(System.in);

    protected String getName(){
        System.out.print("Digite o nome de seu Personagem:");
        name = scanner.nextLine();

        return name;
    }
    
   abstract String selectHability();
}
