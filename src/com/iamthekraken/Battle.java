package com.iamthekraken;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by iamthekraken on 2017.03.06..
 */
public class Battle {

    private boolean ranAway = false;


    public void BattleStart(Hero hero, Enemy enemy) {

        int heroHealth = hero.getHeroHealth();
        int heroDamage = hero.getHeroDamage();
        int potionCount = hero.getPotionCount();
        int manaPotionCount = hero.getManaPotionCount();
        int heroMagicDamage = hero.getHeroMagicDamage();

        int enemyDamage = enemy.getEnemyDamage();
        int enemyHealth = enemy.getEnemyHealth();
        String enemyName = enemy.getEnemyName();

        boolean battleOn = true;
        int randMin = 1;
        int randMax = 3;
        int randDiff = randMax - randMin;

        Potion potions = new Potion();

        while (battleOn) {

            Scanner scanner = new Scanner(System.in);
            while (enemyHealth > 0 && ranAway == false) {
                System.out.println("\n####Battle with " + enemyName + " begins!####");
                System.out.println(enemyName + "'s HP is " + enemyHealth);
                System.out.println("\n Attack: 1" + "\n Defend: 2" + "\n Use Potion: 3" + "\n Run: 4");

                int option = scanner.nextInt();

                while (option < 1 || option > 4) {
                    System.out.println("Please choose a valid option");
                    option = scanner.nextInt();
                }

                if (option == 1) {

                    heroHealth -= enemyDamage;
                    enemyHealth -= heroDamage;

                    System.out.println("You attack the " + enemyName + " and deal " + heroDamage + " damage.");
                    System.out.println("You take " + enemyDamage + " damage in return");
                    System.out.println("Your current HP is " + heroHealth);
                    System.out.println("The " + enemyName + "'s HP is " + enemyHealth);

                    if (heroHealth < 1) {
                        break;
                    }

                } else if (option == 2) {
                    System.out.println("You are defending so take no damage, however you also deal no damage");

                } else if (option == 3) {
                    potions.UsePotion(potionCount, heroHealth, potions.getPotionHealAmount(), potions.getManaPotionHealAmount());
                    heroHealth += potions.getPotionHealAmount();
                    potionCount -= 1;


                } else if (option == 4) {
                    Random rn = new Random();
                    int i = rn.nextInt(randDiff + 1);
                    i += randMin;
                    if (i == 1) {
                        System.out.println("You ran away");
                        ranAway = true;
                    } else {
                        System.out.println("You try to run away but fail." +
                                "You lose " + (enemyDamage / 2) + " HP");
                        heroHealth = (heroHealth - enemyDamage / 2);
                        System.out.println("Your HP is now " + heroHealth);
                    }
                }
            }
            if (heroHealth < 1) {
                System.out.println("You are dead - GAME OVER");
                break;

            } else {
                if (ranAway == false) {
                    System.out.println(enemyName + " is dead!");
                    hero.setHeroHealth(heroHealth);
                    hero.setPotionCount(potionCount);
                    int potionDropped = potions.PotionDrop();
                    if (potionDropped == 1) {
                        hero.setPotionCount(hero.getPotionCount() + 1);
                        System.out.println("The " + enemyName + " dropped a potion!\n You now have " + hero.getPotionCount() + " potions!");
                    }
                    battleOn = false;
                } else {
                    System.out.println("You ran away like the coward you are!");
                    hero.setHeroHealth(heroHealth);
                    hero.setPotionCount(potionCount);
                    battleOn = false;
                }
            }
        }
    }
}




