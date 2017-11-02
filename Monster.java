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
    private int mana;       //Znalezc sensowne zastosowanie
    private double speedAttack;     //Znalezc sensowne zastosowanie
    private int lvl;        //Znalezc sensowne zastosowanie
    private String nameOfTheMonster;
    private int expMin;
    private int expMax;
    private int coinDropMin;
    private int coinDropMax;
    private int damageMin;
    private int damageMax;


    //Variables
    private int health;
    private int healthPotions;


    //Getters
    public int getHealtPotion(int amount){
        return this.healthPotions;
    }

    public int getHealth(){
        return health;
    }

    public int getHealthMax(){
        return healthMax;
    }

    public String getHealthStatusBar(){
        return (health + "/" + healthMax);
    }

    public String getNameOfTheMonster(){
        return nameOfTheMonster;
    }

    public static Monster get(){
        return current;
    }

    public static int getIndex(Monster i){
        return arrayEnemy.indexOf(i);
    }


    //Setters
    public void setHealthPotions(int amount){
        this.healthPotions = amount;
    }

    public void setDamage(int min, int max){
        this.damageMin = min;
        this.damageMax = max;
    }

    public void setCoinDrop(int min, int max){
        this.coinDropMin = min;
        this.coinDropMax = max;
    }

    public void setHealth(int current, int max){
        this.health = current;
        this.healthMax = max;
    }

    public static void set(int i){
        current = arrayEnemy.get(i);
    }


    //Monster constructor
    public Monster(int healthMax, int mana, double speedAttack, int lvl, String nameOfTheMonster, int expMin, int expMax, int coinDropMin, int coinDropMax, int damageMin, int damageMax){
        this.healthMax = healthMax;
        this.mana = mana;
        this.speedAttack = speedAttack;
        this.lvl = lvl;
        this.nameOfTheMonster = nameOfTheMonster;
        this.expMin = expMin;
        this.expMax = expMax;
        this.coinDropMin = coinDropMin;
        this.coinDropMax = coinDropMax;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
    }

    public Monster(){

    }

    //Other methods
    public static void encounterNew(){
        current = arrayEnemy.get(Random.RInt(0, arrayEnemy.size()));
        current.health = current.healthMax;
        current.healthPotions = Random.RInt(HEALTH_POTIONS_MIN, HEALTH_POTIONS_MAX);
    }

    public boolean takeDamage(int damage){
        this.health = health - damage;
        if (this.health <= 0){
            die();
            return true;
        }
        return false;
    }

    public void dealDamage(){
        int damage = Random.RInt(damageMin, damageMax);
        /* Dodac przyjmowanie obrazen - coś w stylu playerHealth.takeDamage(damage) */
    }

    private void die(){
        /* złapać pomysł do napisana */

        //Rewards
        int coin = Random.RInt(coinDropMin, coinDropMax);
        int exp = Random.RInt(expMin, expMax);

        System.out.println("Zajebałeś stworka, dostajesz: " + coin + " monet i " + exp +" punktów doświadczenia!");

        //Dodać monety i expa do bohatera

        //Walka z kolejnym
        encounterNew();
    }

    public boolean useHealthPotions(){
        if (this.healthPotions <= 0){
            return false;
        }
        else{
            this.healthPotions --;
            this.takeDamage(-20); //this.health = health -(-20)
            return true;
        }
    }

    public boolean useMagic(){
        if (this.mana <= 0){
            return false;
        }
        else{
            //Wymyślić zaklęcia
            return true;
        }
    }
}
