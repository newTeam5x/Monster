public class Magic extends Spells {

    Monster monster = new Monster();

    int requiredMana;
    int mana = this.monster.getMana();
    int manaMax = this.monster.getManaMax();
    int currentMana;
    int magicDmg;

    public int useFireBall(int lvl, int minMagicDamage, int maxMagicDamage){
        this.requiredMana = 20;
        System.out.println(mana);

        if (requiredMana > this.mana){
            System.out.println("Ni mosz many na fajer bola");
            return 0;
        }
        else{
            this.magicDmg = Spells.fireBall(lvl, minMagicDamage, maxMagicDamage);
            this.currentMana = mana - requiredMana;
            monster.setMana(currentMana, manaMax);
            System.out.println("Uzyl FireBall! i zadal Ci: " + magicDmg + " punktow obrazen!");
            return magicDmg;
        }
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
