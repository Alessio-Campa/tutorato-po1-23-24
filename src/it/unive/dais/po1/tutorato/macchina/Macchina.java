package it.unive.dais.po1.tutorato.macchina;

public class Macchina {
    Integer kilometri;
    final Integer annoDiProduzione;

    public Macchina(Integer kilometri, Integer annoDiProduzione) {
        this.kilometri = kilometri;
        this.annoDiProduzione = annoDiProduzione;
    }

    public void guida(Integer kilometri){
        this.kilometri += kilometri;
    }
}
