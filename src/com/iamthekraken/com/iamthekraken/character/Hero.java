package com.iamthekraken.com.iamthekraken.character;

/**
 * Created by iamthekraken on 2017.03.06..
 */
public class Hero extends Human {

    private int potionCount = 3;
    private int manaPotionCount = 1;
    private int heroHealth;
    private int heroMana;
    private int heroDamage;
    private int heroMagicDamage;

    private String heroClass = "Unkown";
    private String heroName = "Unkown";

    public Hero(String heroName, String heroClass) {
        this.heroName = heroName;
        this.heroClass = heroClass;

    }


    public int getPotionCount() {
        return potionCount;
    }

    public void setPotionCount(int potionCount) {
        this.potionCount = potionCount;
    }

    public int getManaPotionCount() {
        return manaPotionCount;
    }

    public void setManaPotionCount(int manaPotionCount) {
        this.manaPotionCount = manaPotionCount;
    }

    public String getHeroName() {
        return heroName;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public int getHeroMana() {
        return heroMana;
    }

    public void setHeroMana(int heroMana) {
        this.heroMana = heroMana;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public int getHeroMagicDamage() {
        return heroMagicDamage;
    }

    public void setHeroMagicDamage(int heroMagicDamage) {
        this.heroMagicDamage = heroMagicDamage;
    }

    public String getHeroClass() {
        return heroClass;
    }

}
