package br.unirio.bs1.tp2.dojo2.teste3;

public class Tanker extends Character implements Armored{
    private int shield;
    /*
    @Override
    public String getName(){
        System.out.print("Digite o nome de seu Berserker:");
        name = scanner.nextLine();

        return name;
    }*/


    @Override
    public String selectHability(){
        System.out.println("Escolha uma entre as habilidades:\n[1]-Defesa Ultimate\n[2]-Ataque Ultimate");
        chooseHability = scanner.nextInt();

        while(chooseHability != 1 && chooseHability != 2){
            System.out.println("Dado Inválido.");
            System.out.println("Escolha uma entre as habilidades:\n[1]-Defesa Ultimate\n[2]-Ataque Ultimate");
            chooseHability = scanner.nextInt();
        }

        if(chooseHability == 1){
            hability = "Defesa Ultimate";
        }
        else
            hability = "Ataque Ultimate";

        return hability;

    }

    @Override
    public int useShield(){
        System.out.print("O escudo concede +2 de Defesa, mas sem escudo concede +2 de ataque.\nSeu Personagem usará escudo?(1 para SIM ou 0 para NÃO):");
        shield = scanner.nextInt();

        while(shield != 1 && shield != 0){
            System.out.println("Dado Inválido!");
            System.out.print("O escudo concede +2 de Defesa, mas sem escudo concede +2 de ataque.\nSeu Personagem usará escudo?(1 para SIM ou 0 para NÃO):");
            shield = scanner.nextInt();
        }

        return shield;
    }
}
