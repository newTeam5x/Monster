public class Skeleton extends Monster {

    public Skeleton(int healthMax, int mana, double speedAttack, int lvl, String nameOfTheMonster, int expMin, int expMax, int coinDropMin, int coinDropMax, int damageMin, int damageMax){
        super(healthMax, mana, speedAttack, lvl, nameOfTheMonster, expMin, expMax, coinDropMin, coinDropMax, damageMin, damageMax);
    }

    @Override
    public void dealDamage(){
        super.dealDamage();

    }


    public void takeDamage(){
        super.takeDamage(0); //Ogarnąć
        System.out.println("Chuj kurwa");
    }


}
