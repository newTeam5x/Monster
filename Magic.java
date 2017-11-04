public class Magic {

    Monster monster = new Monster(100, 100, 30, 30, 1.0, 1, "Chuj", 5, 10, 10, 20, 30, 40, 20, 40);

    int requiredMana;
    int mana = monster.getMana();
    int manaMax = monster.getManaMax();
    int currentMana;
    int magicDmg;

    public int useFireBall(int lvl, int minMagicDamage, int maxMagicDamage){
        requiredMana = 20;
        System.out.println(mana);
        System.out.println(manaMax);

        if (requiredMana > mana){
            System.out.println("Ni mosz many na fajer bola");
            return 0;
        }
        else{
            magicDmg = Spells.fireBall(lvl, minMagicDamage, maxMagicDamage);
            currentMana = mana - requiredMana;
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
