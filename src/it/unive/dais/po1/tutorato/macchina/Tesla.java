package it.unive.dais.po1.tutorato.macchina;

public class Tesla extends Macchina{
    String modello;

    Tesla(String modello){
        super(0, 2023);
        this.modello = modello;
    }

    Tesla(Integer kilometri, Integer anno, String modello){
        super(kilometri, anno);
        this.modello = modello;
    }


    public static void main(String[] args) {
        Tesla t = new Tesla("S");
        t.guida(100);
        System.out.println(t.kilometri);
    }

}
