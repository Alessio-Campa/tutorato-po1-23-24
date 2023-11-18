package it.unive.dais.po1.tutorato.bar;

import java.util.List;

public class AperolSpritz extends Spritz{

    public AperolSpritz(){
        super(List.of(), 0, 0, 0);
    }

    private AperolSpritz(Integer liters){
        super(List.of("Aperol", "Prosecco", "Soda"), liters/2, liters/3, liters/6);
    }

    public Cocktail prepare() {
        System.out.println("Mixing Aperol with prosecco and soda");
        return new AperolSpritz(10);
    }
}
