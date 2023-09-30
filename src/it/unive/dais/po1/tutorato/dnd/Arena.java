package it.unive.dais.po1.tutorato.dnd;

public class Arena {
    String name;

    Arena(String name){
        this.name = name;
    }

    public void wizardFight(Wizard a, Wizard b){
        if (a.level*3 + a.hitPoints > b.level*3 + b.hitPoints){
            System.out.println("Winner is "+ a.name);
        }else {
            System.out.println("Winner is "+ b.name);
        }
    }

}
