package com.iamthekraken.com.iamthekraken.character;

/**
 * Created by iamthekraken on 2017.03.16..
 */
public class Mage extends Hero {

    private int potionCount = 3;
    private int manaPotionCount = 1;
    private int heroHealth = 120;
    private int heroMana = 20;
    private int heroDamage = 30;
    private int heroMagicDamage = 10;

    public Mage (String heroName, String heroClass) {
        super(heroName, heroClass);
    }

    @Override
    public int getPotionCount() {
        return potionCount;
    }

    @Override
    public void setPotionCount(int potionCount) {
        this.potionCount = potionCount;
    }

    @Override
    public int getManaPotionCount() {
        return manaPotionCount;
    }

    @Override
    public void setManaPotionCount(int manaPotionCount) {
        this.manaPotionCount = manaPotionCount;
    }

    @Override
    public int getHeroHealth() {
        return heroHealth;
    }

    @Override
    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    @Override
    public int getHeroMana() {
        return heroMana;
    }

    @Override
    public void setHeroMana(int heroMana) {
        this.heroMana = heroMana;
    }

    @Override
    public int getHeroDamage() {
        return heroDamage;
    }

    @Override
    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    @Override
    public int getHeroMagicDamage() {
        return heroMagicDamage;
    }

    @Override
    public void setHeroMagicDamage(int heroMagicDamage) {
        this.heroMagicDamage = heroMagicDamage;
    }
}
