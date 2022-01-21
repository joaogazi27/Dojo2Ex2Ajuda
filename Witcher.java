package br.unirio.bs1.tp2.dojo2.teste3;
import java.util.Scanner;
public class Witcher extends Character implements Armored,Magical{
    private String spell;
    private int shield;

    /*
    @Override
    public String getName(){
        System.out.print("Digite o nome de seu Bruxo:");
        name = scanner.nextLine();
        return name;
    }*/

    @Override
    public String selectHability(){
        System.out.println("Escolha uma entre as habilidades:\n[1]-Ataque Amaldiçoado\n[2]-Magia de Fogo");
        chooseHability = scanner.nextInt();

        while(chooseHability != 1 && chooseHability != 2){
            System.out.println("Dado Inválido.");
            System.out.println("Escolha uma entre as habilidades:\n[1]-Ataque Amaldiçoado\n[2]-Magia de Fogo");
            chooseHability = scanner.nextInt();
        }

        if(chooseHability == 1){
            hability = "Ataque Amaldiçoado";
        }
        else
            hability = "Magia de Fogo";
        return hability;

    }
    @Override
    public String getSpells(){
        scanner.nextLine();
        System.out.print("Digite A magia que seu Bruxo usará (concede +1 de Ataque):");
        spell = scanner.nextLine();
        return spell;

    }
    @Override
    public int useShield(){
        System.out.print("O escudo concede +1 de Defesa, mas sem escudo concede +1 de ataque.\nSeu Personagem usará escudo?(1 para SIM ou 0 para NÃO):");
        shield = scanner.nextInt();

        while(shield != 1 && shield != 0){
            System.out.println("Dado Inválido!");
            System.out.print("O escudo concede +1 de Defesa, mas sem escudo concede +1 de ataque.\nSeu Personagem usará escudo?(1 para SIM ou 0 para NÃO):");
            shield = scanner.nextInt();
        }

        return shield;
    }
}
