package com.iamthekraken;

/**
 * Created by iamthekraken on 2017.03.07..
 */

import java.util.Scanner;

public class CharacterCreator {

    Scanner scanner = new Scanner (System.in);

    public String nameCreator (){

        String name;

        System.out.println("Welcome to the TextBasedRPG v2.0");
        System.out.println("\nPlease enter your character's name: \r");
        name = scanner.nextLine();
        System.out.println("\nPlease choose a character class: " +
                "\n1. Warrior - High damage, High Base Health\n2. Mage - High Magic Damage, Low Base Health" +
                "\n3. Rouge - Extra high damage, Low Base Health\r");
        return name;
    }

    public String classSelect (){
        int choice;
        choice = scanner.nextInt();
        String characterClass = "Unkown";

        while(choice < 1 || choice > 3) {
            System.out.println("Please enter a valid number!");
            choice = scanner.nextInt();
        }
        if (choice == 1) {
            characterClass = "Warrior";
        } else if (choice == 2) {
            characterClass = "Mage";
        } else if (choice == 3) {
            characterClass = "Rogue";
        }
        return characterClass;
    }


    public static Hero classCreator(Hero hero){
        int choice;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

        while(choice < 1 || choice > 3) {
            System.out.println("Please enter a valid number!");
            choice = scanner.nextInt();
        }

        if (choice == 1) {
            hero.setHeroClass("Warrior");
            hero = new Warrior(hero.getHeroName(), hero.getHeroClass());
        } else if (choice == 2) {
            hero.setHeroClass("Mage");
            hero = new Mage(hero.getHeroName(), hero.getHeroClass());
        } else if (choice == 3) {
            hero.setHeroClass("Rogue");
            hero = new Rouge(hero.getHeroName(), hero.getHeroClass());
        }

        return hero;
    }

}
