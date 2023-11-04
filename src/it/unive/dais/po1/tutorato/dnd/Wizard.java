package it.unive.dais.po1.tutorato.dnd;

public class Wizard {
    static Integer numberOfWizards = 0;
    Integer hitPoints;
    String name;
    private Integer experiencePoints;
    private Integer level;
    Integer id;
    private String WiFiPassword;
    private Wizard father;
    private Wizard child;

    Wizard(Integer hp, String name, Integer xp){
        this.hitPoints = hp;
        this.name = name;
        this.experiencePoints = xp;
        this.level = xp / 400;
        this.id = numberOfWizards++;
        this.WiFiPassword = name + "1234";
    }

    /* Anche se i nomi dei parametri sono diversi, i tipi sono gli stessi, per cui Java non saprebbe quale costruttore chiamare

    Wizard(Integer xp, String name, Integer hp){
        this.hitPoints = hp;
        this.name = name;
        this.experiencePoints = xp;
    }
     */

    public Wizard getFather() {
        return father;
    }

    public void setFather(Wizard father) {
        this.father = father;
    }

    public Wizard getChild() {
        return child;
    }

    public void setChild(Wizard child) {
        this.child = child;
    }

    private void analyzeWizard(Wizard other){
        System.out.println(other.WiFiPassword);
    }

    Wizard(String name, Integer xp, Integer hp){
        this(hp, name, xp);
        this.name = name + " [secondo costruttore]";
    }

    public Wizard(String name){
        this(12, name, 0);
    }

    void fight(Arena a, Wizard other){
        System.out.println("[" + this.name +"]: " + other.name + " voglio combattere nell'arena " + a.name);
        a.wizardFight(this, other);
        Integer temp = this.hitPoints;
        this.hitPoints = Math.max(this.hitPoints - other.hitPoints, 0);
        other.hitPoints = Math.max(other.hitPoints - temp, 0);
    }

    static { // costruttore statico
        numberOfWizards = 0;
    }

    static Integer getWizardPopulation(){
        // this.id; Non si può fare in quanto siamo in un contesto statico
        return numberOfWizards;
    }

    /**
     * @since 1.2.3
     * @return the experience points of the wizard
     */
    public Integer getExperiencePoints() {
        return experiencePoints;
    }

    /**
     * Updates the xp of the wizard and the level relative to a secret formula
     * @param experiencePoints the new experience points of the wizard
     *
     * */
    public void setExperiencePoints(Integer experiencePoints) {
        this.experiencePoints = experiencePoints;
        this.level = this.experiencePoints / 400;
    }

    public Integer getLevel() {
        return level;
    }


    public static void main(String[] args) {
        Wizard merlino = new Wizard(12, "Merlino", 0);
        Wizard strange1 = new Wizard(72, "Doctor Strange", 1000);
        Wizard strange2 = new Wizard("Doctor Strange", 1000, 72);
        Wizard dynamo  = new Wizard("Dynamo");
        dynamo.hitPoints = 42;

        dynamo.setFather(merlino);
        merlino.setChild(dynamo);

        dynamo.getFather().getChild().getFather().getChild();

        Wizard dynamoFather = dynamo.getFather();
        dynamoFather.setExperiencePoints(100000);
        dynamoFather = strange2;

        System.out.println(dynamo.getFather().name);
        System.out.println(dynamoFather.name);

        System.out.println(merlino.id);
        System.out.println(strange1.id);
        System.out.println(Wizard.getWizardPopulation());

        Arena arena = new Arena("Colosseo");

        merlino.fight(arena, strange1);
        System.out.println(merlino.hitPoints);
        System.out.println(strange1.hitPoints);

        // strange1.fight(arena, merlino);

        merlino.level = 100;

        System.out.println(dynamo.hitPoints);

        merlino.analyzeWizard(dynamo);
    }

}
