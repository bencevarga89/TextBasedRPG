package com.iamthekraken.com.iamthekraken.character;

/**
 * Created by iamthekraken on 2017.03.07..
 */

import java.util.Scanner;

public class CharacterCreator {

    Scanner scanner = new Scanner (System.in);

    public String NameCreator (){

        String name;

        System.out.println("Welcome to the TextBasedRPG v2.0");
        System.out.println("\nPlease enter your character's name: \r");
        name = scanner.nextLine();
        System.out.println("\nPlease choose a character class: " +
                "\n1. Warrior - High damage, High Base Health\n2. Mage - High Magic Damage, Low Base Health" +
                "\n3. Rouge - Extra high damage, Low Base Health\r");
        return name;
    }

    public String ClassCreator(){

        String heroClass = "Unkown";
        int choice = scanner.nextInt();

        while(choice < 1 || choice > 3) {
            System.out.println("Please enter a valid number!");
            choice = scanner.nextInt();
        }

        if (choice == 1) {
            heroClass = "Warrior";
        } else if (choice == 2) {
            heroClass = "Mage";
        } else if (choice == 3) {
            heroClass = "Rouge";
        }
        return heroClass;
    }

}
