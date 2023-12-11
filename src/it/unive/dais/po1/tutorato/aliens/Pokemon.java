package it.unive.dais.po1.tutorato.aliens;

public class Pokemon implements Evolvable{
    String name;

    public Pokemon(String name) {
        this.name = name;
    }

    @Override
    public void transform() {
        System.out.println("I'm evolving");
    }

    @Override
    public String getName() {
        return name;
    }
}
