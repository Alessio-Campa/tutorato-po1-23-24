package it.unive.dais.po1.tutorato.aliens;

public interface Transformable {
    default void transform(){
        System.out.println(getName());
        System.out.println("Transformation method");
    }

    String getName();
}
