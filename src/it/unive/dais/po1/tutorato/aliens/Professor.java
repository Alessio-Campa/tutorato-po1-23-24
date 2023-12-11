package it.unive.dais.po1.tutorato.aliens;

public class Professor extends Human{

    public Professor(String name) {
        super(name);
    }

    void teach(){
        System.out.println("I'm teaching");
    }
}
