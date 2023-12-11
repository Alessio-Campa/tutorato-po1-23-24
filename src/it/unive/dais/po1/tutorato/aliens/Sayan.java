package it.unive.dais.po1.tutorato.aliens;

public class Sayan extends Humanoid implements Transformable{

    public Sayan(String name) {
        super(name);
    }

    @Override
    void greet(Humanoid other) {
        System.out.println("AAAAAAAAAAAAAAA");
    }

    public void transform(){
        System.out.println(name + ": AAAAAAAAAA");
    }

    @Override
    public String getName() {
        return name;
    }

}
