package it.unive.dais.po1.tutorato.dnd;

public class Wizard {
    Integer hitPoints;
    String name;
    Integer experiencePoints;
    Integer level;

    Wizard(Integer hp, String name, Integer xp){
        this.hitPoints = hp;
        this.name = name;
        this.experiencePoints = xp;
        this.level = xp / 400;
    }

    /* Anche se i nomi dei parametri sono diversi, i tipi sono gli stessi, per cui Java non saprebbe quale costruttore chiamare

    Wizard(Integer xp, String name, Integer hp){
        this.hitPoints = hp;
        this.name = name;
        this.experiencePoints = xp;
    }
     */

    Wizard(String name, Integer xp, Integer hp){
        this(hp, name, xp);
        this.name = name + " [secondo costruttore]";
    }

    Wizard(String name){
        this(12, name, 0);
    }

    void fight(Arena a, Wizard other){
        System.out.println("[" + this.name +"]: " + other.name + " voglio combattere nell'arena " + a.name);
        a.wizardFight(this, other);
    }


    public static void main(String[] args) {
        Wizard merlino = new Wizard(12, "Merlino", 0);
        Wizard strange1 = new Wizard(72, "Doctor Strange", 1000);
        Wizard strange2 = new Wizard("Doctor Strange", 1000, 72);
        Wizard dynamo  = new Wizard("Dynamo");
        dynamo.hitPoints = 42;

        Arena arena = new Arena("Colosseo");

        merlino.fight(arena, strange1);
        strange1.fight(arena, merlino);

        System.out.println(dynamo.hitPoints);
    }

}
