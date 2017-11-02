public class Spells extends Monster{

    public static int fireBall(int lvl, int minDmg, int maxDmg){
        int spellDamage = Random.RInt(minDmg, maxDmg);
        spellDamage *= lvl;
        //Możliwość dodania specjalnych właściwości, jak poparzenie czy podpalenie i odejmowania punktów życia co turę
        return spellDamage;
    }

    public static int iceSpike(int lvl, int minDmg, int maxDmg){
        int spelldamage = Random.RInt(minDmg, maxDmg);
        spelldamage *= lvl;
        return spelldamage;
    }

    public static int heal (int lvl, int minDmg, int maxDmg){
        int spellDamage = Random.RInt(minDmg, maxDmg);
        spellDamage *= lvl;
        //Ma działać tak samo jak potki, w sensie takeDamage(-spelldamage)
        return spellDamage;

    }

}
