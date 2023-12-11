package it.unive.dais.po1.tutorato.aliens;

public class Human extends Humanoid{

    public Human(String name) {
        super(name);
    }

    @Override
    void greet(Humanoid other) {
        System.out.println("Hi, I'm " + name + " and I greet the humanoid " + other.name);
    }

    void greet(Human other){
        System.out.println("Hi, I'm " + name + " and I greet the other human " + other.name);
    }

    public void shakeHands(Human other){
        System.out.println("[Shaking hand with " + other.name + "]");
    }


    public static void main(String[] args) {
        Humanoid dwayne = new Human("Dwayne");
        Transformable goku = new Sayan("Goku"); // suppose it's chosen at random
        Transformable pikachu = new Pokemon("Pikachu");
        Human benedict = new Human("Benedict");
        Human peter = new Professor("Pietro Ferrara");

        peter.greet(benedict);
        // Professor gohan = (Professor) goku; // Throws exception
        pikachu.transform();

        if (goku instanceof Professor){ // check DYNAMIC type
            Professor p = (Professor) peter;
            p.teach();
        }
        if (goku instanceof Sayan){
            Sayan s = (Sayan) goku;
            s.transform();
        }
        if (goku instanceof Object){ // useless
            Object o = (Object) goku;
        }


    }


}
