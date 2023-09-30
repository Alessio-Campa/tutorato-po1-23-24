package it.unive.dais.po1.tutorato;

public class Card {
    Integer value;
    String suit;
    static Integer id;

    Card(Integer value, String suit){
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
        Card c = new Card(10, "hearts");
    }
}
