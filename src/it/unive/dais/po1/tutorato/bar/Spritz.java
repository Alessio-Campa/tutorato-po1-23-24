package it.unive.dais.po1.tutorato.bar;

import java.util.List;

public abstract class Spritz extends Cocktail{
    Integer proseccoL;
    Integer bitterL;
    Integer sodaL = 0;

    public Spritz(List<String> ingredients, Integer proseccoL, Integer bitterL, Integer sodaL) {
        super(ingredients, 10.7);
        this.bitterL = bitterL;
        this.proseccoL = proseccoL;
        this.sodaL = sodaL;
    }



}
