package kg.geecks.game.players;

import kg.geecks.game.logic.RPG_Game;

public class Berserk extends Hero {
    private int blockedDamage;
    private Boss boss;


    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.BLOCK_DAMAGE_AND_REVERT, name);
    }

    public void setBlockedDamage(int blockedDamage) {
        this.blockedDamage = blockedDamage;
    }

    @Override
    public int applySuperPower(Boss boss, Hero[] heroes) {
        if (boss.getDamage() != 0) {
            setBlockedDamage(RPG_Game.random.nextInt(boss.getDamage() + 1));
            if (boss.getHealth() > 0 && this.getHealth() > 0) {
                this.setHealth(boss.getHealth() - blockedDamage);
                boss.setHealth(boss.getHealth() - blockedDamage + this.getDamage());
                System.out.println("Берсерк использовал супеспособность");

            }
        }return 0 ;

        }

    }


