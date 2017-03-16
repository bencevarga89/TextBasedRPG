package com.iamthekraken;

import com.iamthekraken.com.iamthekraken.battle.Battle;
import com.iamthekraken.com.iamthekraken.character.Enemy;
import com.iamthekraken.com.iamthekraken.character.Hero;

import java.util.Scanner;

/**
 * Created by iamthekraken on 2017.03.07..
 */
public class Actions {

    static Scanner scanner = new Scanner(System.in);

    public static int choice;

    public static void PageCall(Hero hero, int pageNumber) {

        switch(pageNumber) {

            case 1:

                System.out.println("#### Your are: ####" +
                        "\nName: " + hero.getHeroName() + "\nClass: " + hero.getHeroClass() +
                        "\n\nYou wake up in a dark dungeon cell. The door is left open. You step outside the cell door" +
                        "\nonly to find yourself in front of an Enemy! \nYou have to fight it!");
                Enemy enemy = new Enemy();
                Battle battle = new Battle();
                battle.BattleStart(hero, enemy);
                Actions.PageCall(hero, 23);
                break;

            case 23:
                System.out.println("\n\nAfter defeating your enemy you continue in the dark corridor." +
                        "\nSuddenly you run the corridor splits and you have a choice to go left or right."+
                        "\n To go left turn to page 48"+
                        "\n To go right turn to page 72");
                choice = scanner.nextInt();
                Actions.PageCall(hero,choice);
                break;


            case 48:
                System.out.println("You turned right, good job");

                break;


            case 72:
                System.out.println("You turned left, good job");
                break;

            default:
                System.out.println("There is no such page in this book :(");


        }






    }

}



