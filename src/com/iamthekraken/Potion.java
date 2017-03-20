package com.iamthekraken;

import java.util.Random;

/**
 * Created by iamthekraken on 2017.03.06..
 */
public class Potion {

    private int potionHealAmount = 20;
    private int manaPotionHealAmount = 20;

    public int getPotionHealAmount() {
        return potionHealAmount;
    }

    public int getManaPotionHealAmount() {
        return manaPotionHealAmount;
    }

    public int usePotion(int potionCount, int health, int potionHealAmount, int manaPotionHealAmount) {
        if (potionCount > 0) {
            health += potionHealAmount;
            potionCount -= 1;
            System.out.println("You used a potion!" + "\n\tYour health is now: " + health + "." +
                    "\n\tYou have " + potionCount + " potions left.");

        } else {
            System.out.println("You have no potions left");
        }
        return health;
    }


    public int potionDrop() {
        int randMinPotion = 1;
        int randMaxPotion = 3;
        int randDiffPotion = randMaxPotion - randMinPotion;
        int potionDropped = 0;

            Random rn = new Random();
            int potionDropChance = rn.nextInt(randDiffPotion + 1);
            potionDropChance += randMinPotion;
            if (potionDropChance == 1) {
            potionDropped = 1;
            }else{
                potionDropped = 0;
            }

        return potionDropped;
    }

}



