import java.util.ArrayList;


public class Monster {


    //Constants
    private static final int HEALTH_POTIONS_MAX = 2;
    private static final int HEALTH_POTIONS_MIN = 0;


    //Enemy list
    public static final ArrayList<Monster> arrayEnemy = new ArrayList<>();


    //Static variables
    private static Monster current;


    //Properties (Constant)
    private int healthMax;
    private int manaMax;
    private double speedAttack;     //Znalezc sensowne zastosowanie
    private int lvl;        //Znalezc sensowne zastosowanie
    private String nameOfTheMonster;
    private int expMin;
    private int expMax;
    private int coinDropMin;
    private int coinDropMax;
    private int damageMin;
    private int damageMax;
    private int minMagicDmg;
    private int maxMagicDmg;


    //Variables
    private int health;
    private int mana;       //Znalezc sensowne zastosowanie
    private int healthPotions;


    //Getters
    public int getHealtPotion(int amount) {
        return this.healthPotions;
    }

    public int getHealth() {
        return health;
    }

    public int getHealthMax() {
        return healthMax;
    }

    public String getHealthStatusBar() {
        return (health + "/" + healthMax);
    }

    public int getMana() {
        return mana;
    }

    public int getManaMax() {
        return manaMax;
    }

    public String getManaStatusBar() {
        return (mana + "/" + manaMax);
    }

    public String getNameOfTheMonster() {
        return nameOfTheMonster;
    }

    public static Monster get() {
        return current;
    }

    public static int getIndex(Monster i) {
        return arrayEnemy.indexOf(i);
    }

    public int getLvl() {
        //return lvl *= heroLvl;
        return lvl;
    }

    public int getMinMagicDmg() {
        return minMagicDmg;
    }

    public int getMaxMagicDmg() {
        return maxMagicDmg;
    }


    public int getDamageMin() {
        return damageMin;
    }

    public int getDamageMax() {
        return damageMax;
    }


    //Setters
    public void setHealthPotions(int amount) {
        this.healthPotions = amount;
    }

    public void setDamage(int min, int max) {
        this.damageMin = min;
        this.damageMax = max;
    }

    public void setCoinDrop(int min, int max) {
        this.coinDropMin = min;
        this.coinDropMax = max;
    }

    public void setHealth(int current, int max) {
        this.health = current;
        this.healthMax = max;
    }

    public void setMana(int current, int max) {
        this.mana = current;
        this.manaMax = max;
    }

    public static void set(int i) {
        current = arrayEnemy.get(i);
    }


    //Monster constructor
    public Monster(int health, int healthMax, int mana, int manaMax, double speedAttack, int lvl, String nameOfTheMonster, int expMin, int expMax, int coinDropMin, int coinDropMax, int damageMin, int damageMax, int minMagicDmg, int maxMagicDmg) {
        this.health = health;
        this.healthMax = healthMax;
        this.mana = mana;
        this.manaMax = manaMax;
        this.speedAttack = speedAttack;
        this.lvl = lvl;
        this.nameOfTheMonster = nameOfTheMonster;
        this.expMin = expMin;
        this.expMax = expMax;
        this.coinDropMin = coinDropMin;
        this.coinDropMax = coinDropMax;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.minMagicDmg = minMagicDmg;
        this.maxMagicDmg = maxMagicDmg;
    }

    public Monster() {

    }

    //Other methods
    public static void encounterNew() {
        current = arrayEnemy.get(Random.RInt(0, arrayEnemy.size()));
        current.health = current.healthMax;
        current.healthPotions = Random.RInt(HEALTH_POTIONS_MIN, HEALTH_POTIONS_MAX);
    }

    public boolean takeDamage(int damage) {
        this.health = health - damage;
        if (this.health <= 0) {
            die();
            return true;
        }
        return false;
    }

    public void dealDamage(int damage) {
        /* Dodac przyjmowanie obrazen - coś w stylu playerHealth.takeDamage(damage) */
    }

    private void die() {
        /* złapać pomysł do napisana */

        //Rewards
        int coin = Random.RInt(coinDropMin, coinDropMax);
        int exp = Random.RInt(expMin, expMax);

        System.out.println("Zajebałeś stworka, dostajesz: " + coin + " monet i " + exp + " punktów doświadczenia!");

        //Dodać monety i expa do bohatera

        //Walka z kolejnym
        //encounterNew(); -> nie wiem czemu nie działa :/
    }

    public boolean useHealthPotions() {
        if (this.healthPotions <= 0) {
            return false;
        } else {
            this.healthPotions--;
            this.takeDamage(-20); //this.health = health -(-20)
            return true;
        }
    }

    public int useMagic(int minMagicDmg, int maxMagicDmg) {
        int chooseSpell = Random.RInt(1, 2);
        int magicDmg;

        if (chooseSpell == 1){
            System.out.println("Przed uzyciem zaklecia: " + getManaStatusBar());
            int requiredMana = 20;
            magicDmg = Magic.useFireBall(getLvl(), minMagicDmg, maxMagicDmg, getMana());
            int currentMana = getMana() - requiredMana;
            setMana(currentMana, getManaMax());
            System.out.println("Po uzyciu zaklecia: " + getManaStatusBar());
            System.out.println(getNameOfTheMonster() + " uzyl FireBall! i zadal Ci: " + magicDmg + " punktow obrazen!");
            dealDamage(magicDmg);
            return magicDmg;
        }
        else if (chooseSpell == 2){
            System.out.println("Ice Spike spell!");
        }
        return 0;
    }

    public int physicalAttack(int damageMin, int damageMax){
        int damage = Random.RInt(damageMin, damageMax);
        dealDamage(damage);
        return damage;
    }

    public int testMany (){
        mana = getMana();
        manaMax = getManaMax();
        System.out.println("Masz: " + mana + "/" + manaMax + " many");

        return mana;
    }
}
