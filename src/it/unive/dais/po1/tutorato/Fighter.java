package it.unive.dais.po1.tutorato;

public class Fighter {
    Integer hitPoints;
    Integer expPoints;
    Integer level;

    public Fighter(Integer hitPoints, Integer expPoints) {
        this.hitPoints = hitPoints;
        this.expPoints = expPoints;
        setLevel();
    }

    private void setLevel(){
        this.level = Math.min(20, this.expPoints/400 + 1);
    }

    public Integer getPower(){
        return this.level * this.hitPoints;
    }

    public Fighter fight(Fighter other){
        if(this.getPower().equals(other.getPower()))
            return null;
        else if(this.getPower() > other.getPower())
            return this;
        else
            return other;
    }

    public static void main(String[] args) {
        Fighter f1 = new Fighter(90, 450);
        Fighter f2 = new Fighter(90, 451);
        System.out.println(f1.fight(f2).expPoints);
    }

}
