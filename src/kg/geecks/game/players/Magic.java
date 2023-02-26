package kg.geecks.game.players;

import kg.geecks.game.logic.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public int applySuperPower(Boss boss, Hero[] heroes) {
int attack = RPG_Game.random.nextInt(4+2);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth()>0 && this !=heroes[i] && boss.getDefence()!=SuperAbility.BOOST){
                heroes[i]. setDamage(heroes[i].getDamage()+attack);
            }


        }
        System.out.println("Магический герой применил суперспособность"+attack);
        return attack;










    }
}
