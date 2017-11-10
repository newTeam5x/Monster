public class Spells extends Magic{

    public static int fireBall(int lvl, int minDmg, int maxDmg){
        int spellDamage = Random.RInt(minDmg, maxDmg);
        spellDamage *= lvl;
        //Możliwość dodania specjalnych właściwości, jak poparzenie czy podpalenie i odejmowania punktów życia co turę
        return spellDamage;
    }

    public static int iceSpike(int lvl, int minDmg, int maxDmg){
        //lvl = getLvl();
        //manaConsumption = 20;
        int spellDamage = Random.RInt(minDmg, maxDmg);
        spellDamage *= lvl;
        return spellDamage;
    }

    public static int heal (int lvl, int minDmg, int maxDmg){
        //lvl = getLvl();
        //manaConsumption = 40;
        int spellDamage = Random.RInt(minDmg, maxDmg);
        spellDamage *= lvl;
        //Ma działać tak samo jak potki, w sensie takeDamage(-spelldamage)
        return spellDamage;
    }



}
