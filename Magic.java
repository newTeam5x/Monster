public class Magic extends Spells {

    public static int useFireBall(int lvl, int minMagicDamage, int maxMagicDamage, int mana){
        int requiredMana = 20;

        if (requiredMana > mana){
            System.out.println("Ni mosz many na fajer bola");
            return 0;
        }
        int magicDmg = Spells.fireBall(lvl, minMagicDamage, maxMagicDamage);
        return magicDmg;
    }

    public static int useIceSpike(int lvl, int minMagicDamage, int maxMagicDamage, int mana){
        int requiredMana = 40;

        if (requiredMana > mana){
            System.out.println("Ni mosz many, skurwysynu, na ajs spajka!");
            return 0;
        }
        int currentMana = mana - requiredMana;
        int magicDmg = Spells.iceSpike(lvl, minMagicDamage, maxMagicDamage);
        System.out.println("Uzyl: Ice Spike! i zadal Ci " + magicDmg + " punktow obrazen");

        return magicDmg;
    }
}
