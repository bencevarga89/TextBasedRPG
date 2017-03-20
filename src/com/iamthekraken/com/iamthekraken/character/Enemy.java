package com.iamthekraken.com.iamthekraken.character;

import java.util.Random;

/**
 * Created by iamthekraken on 2017.03.06..
 */
public class Enemy {

    private String enememyName;
    private int enemyDamage;
    private int enemyHealth;

    public Enemy() {
        this.enememyName = GenerateEnemyName();
        this.enemyDamage = GenerateEnemyDamage();
        this.enemyHealth = GenerateEnemyHealth();
    }

    public String GenerateEnemyName() {
        Random rand = new Random();
        String[] enemies = {"Skeleton", "Orc", "Goblin", "Imp", "Bandit"};
        int randomIndex = rand.nextInt(enemies.length);
        return enemies[randomIndex];

    }
    public int GenerateEnemyHealth() {
        Random rand = new Random();
        rand = new Random();
        int healthLow = 40;
        int healthHigh = 100;
        int health = rand.nextInt(healthHigh - healthLow) + healthLow;
        return health;

    }
    public int GenerateEnemyDamage() {
        Random rand = new Random();
        rand = new Random();
        int damageLow = 5;
        int damageHigh = 20;
        int damage = rand.nextInt(damageHigh - damageLow) + damageLow;
        return damage;

    }

    public String getEnemyName() {
        return enememyName;
    }

    public void setEnemyName(String enememyName) {
        this.enememyName = enememyName;
    }

    public int getEnemyDamage() {
        return enemyDamage;
    }

    public void setEnemyDamage(int enemyDamage) {
        this.enemyDamage = enemyDamage;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }
}
