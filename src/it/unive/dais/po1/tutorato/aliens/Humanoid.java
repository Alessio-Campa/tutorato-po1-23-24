package it.unive.dais.po1.tutorato.aliens;

public abstract class Humanoid {
    String name;

    public Humanoid(String name) {
        this.name = name;
    }

    abstract void greet(Humanoid other);

}
