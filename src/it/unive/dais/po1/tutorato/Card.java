package it.unive.dais.po1.tutorato;

import it.unive.dais.po1.tutorato.dnd.Wizard;

public class Card {
    final Integer value;
    final String suit;
    static Integer id;

    Card(Integer value, String suit){
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
        Card c = new Card(10, "hearts");
        Wizard m = new Wizard("merlino");


        System.out.println(m.getLevel());
        m.setExperiencePoints(1000);
        System.out.println(m.getExperiencePoints());
        System.out.println(m.getLevel());


    }
}
