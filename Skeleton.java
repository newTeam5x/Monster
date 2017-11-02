public class Skeleton extends Monster {

    public Skeleton(int health, int healthMax, int mana, int manaMax, double speedAttack, int lvl, String nameOfTheMonster, int expMin, int expMax, int coinDropMin, int coinDropMax, int damageMin, int damageMax, int minMagicDmg, int maxMagicDmg){
        super(health, healthMax, mana, manaMax, speedAttack, lvl, nameOfTheMonster, expMin, expMax, coinDropMin, coinDropMax, damageMin, damageMax, minMagicDmg, maxMagicDmg);
    }

    int damage = Random.RInt(getDamageMin(), getDamageMax());

    public void dealDamage(){
        int typeOfAttack = Random.RInt(1,2);
        if (typeOfAttack == 1){
            super.dealDamage(damage);
        }
        else{
            int magicAttack = Random.RInt(1,6);
            if (magicAttack == 5 || magicAttack == 3){
                useMagic(getMinMagicDmg(), getMaxMagicDmg());
            }
        }

    }


    public void takeDamage(){
        System.out.println("Chuj kurwa");
    }
}
