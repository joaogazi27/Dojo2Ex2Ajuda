package br.unirio.bs1.tp2.dojo2.teste3;
import java.util.Scanner;
public class Wizard extends Character implements Magical{
    private String spell;
    /*
    @Override
    public String getName(){
        System.out.print("Digite o nome de seu Mago:");
        name = scanner.nextLine();
        return name;
    }*/

    @Override
    public String selectHability(){
        System.out.println("Escolha uma entre as habilidades:\n[1]-Ataque de Fogo\n[2]-Ataque de Gelo");
        chooseHability = scanner.nextInt();

        while(chooseHability != 1 && chooseHability != 2){
            System.out.println("Dado Inválido.");
            System.out.println("Escolha uma entre as habilidades:\n[1]-Ataque de Fogo\n[2]-Ataque de Gelo");
            chooseHability = scanner.nextInt();
        }

        if(chooseHability == 1){
            hability = "Ataque de Fogo";
        }
        else
            hability = "Ataque de Gelo";

        return hability;

    }
    @Override
    public String getSpells(){
        scanner.nextLine();
        System.out.print("Digite A magia que seu Mago usará (Concede +2 de Ataque):");
        spell = scanner.nextLine();
        return spell;

    }
}
