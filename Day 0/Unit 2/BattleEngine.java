// a class for all of the battle engine functions
// this class will be used to validate the type, element, weakness, health, and attack of the
// monsters
// there's also methods that will be used to calculate the damage and the health of the monsters
// and apply the type advantage multipliers

import java.util.ArrayList;

public class BattleEngine {

    // to-do: validateStats
    // checks if the monster stats are valid
    // the total combined stats of the monster should not exceed 250
    public static boolean validateStats(Monster monster) {
        if (monster == null) {
            throw new IllegalArgumentException("Monster is null");
        }
        if (monster.getHealth() <= 0) {
            return false;
        }
        if (monster.getAttack() <= 0) {
            return false;
        }
        if (monster.getDefense() <= 0) {
            return false;
        }
        if (monster.getSpeed() <= 0) {
            return false;
        }
        if (monster.getTotalStatSum() > 250) {
            return false;
        }
        return true;
    }

    // to-do: validateElement
    // checks if the monster element is valid
    // the only valid types allowed are "Fire", "Water", "Earth", and "Air"
    public static boolean validateElement(Monster monster) {
        if (monster.getElement() != ElementType.AIR || monster.getElement() != ElementType.FIRE
                || monster.getElement() != ElementType.WATER || monster.getElement() != ElementType.EARTH) {
            return false;
        }
        if (monster.getElement() == null) {
            throw new IllegalArgumentException("Monster Element is null");
        }
        return true;
    }

    // to-do: correctStats
    // checks if stats are invalid
    // fixes them so they are valid, however you choose
    public static void correctStats(Monster monster) {
        if (monster.getHealth() <= 0) {
            monster.setHealth(1);
        }
        if (monster.getAttack() <= 0) {
            monster.setAttack(1);
        }
        if (monster.getDefense() <= 0) {
            monster.setDefense(1);
        }
        if (monster.getSpeed() <= 0) {
            monster.setSpeed(1);
        }
        if (monster.getTotalStatSum() > 250) {
            monster.setHealth(1);
            monster.setAttack(1);
            monster.setDefense(1);
            monster.setSpeed(1);
        }
        return;
    }

    // to-do: startBattle
    // each monster takes turn attacking the other until a monster's hp reaches 0.
    // It returns the
    // winning monster.
    public static Monster startBattle(Monster monster1, Monster monster2) {
        if (monster1 == null || monster2 == null) {
            throw new IllegalArgumentException("One of the monsters is null!");
        }

        correctStats(monster2);
        correctStats(monster1);
        monster1.hasUsedDoubleDown = false;
        monster2.hasUsedDoubleDown = false;

        System.out.println(monster1.getName() + " wants to fight!");
        System.out.println(monster2.getName() + " wants to fight!");

        displayStatus(monster1, monster2);

        Monster first = monster1;
        Monster second = monster2;

        if (monster2.getSpeed() > monster1.getSpeed()) {
            first = monster2;
            second = monster1;
        }

        while (monster1.getHealth() > 0 && monster2.getHealth() > 0) {
            first.attack(second);
            if (second.getHealth() <= 0) {
                second.setHealth(0);
                displayStatus(monster1, monster2);
            }
            second.attack(first);
            if (first.getHealth() <= 0) {
                first.setHealth(0);
                displayStatus(monster1, monster2);
            }

        }

        Monster winner = monster1;
        if (monster1.getHealth() > 0) {
            winner = monster1;
        } else if (monster2.getHealth() > 0) {
            winner = monster2;
        }
        System.out.println(winner.getName() + " wins!");
        System.out.println(winner.victoryNoise());
        return winner;

    }

    // to-do: battleEveryone
    // method battles monsters found in an ArrayList.
    public static Monster battleEveryone(ArrayList<Monster> monsters) {
        if (monsters == null || monsters.size() == 0) {
            throw new IllegalArgumentException("Monsters list cannot be null or empty");
        }
        for (int i = 0; i < monsters.size(); i++) {
            if (monsters.get(i) == null) {
                throw new IllegalArgumentException("No monsters can be null");
            }
        }

        Monster current = monsters.get(0);
        for (int i = 1; i < monsters.size(); i++) {
            current = startBattle(current, monsters.get(i));
        }
        return current;
    }

    // to-do: displayStatus
    // method prints out the current health of each monster.
    public static void displayStatus(Monster monster, Monster opponent) {
        if (monster == null) {
            throw new IllegalArgumentException("Monster cant be null");
        }
        System.out.println("Chimney the Chimera: 50 health vs Truant the Treant: 10 health");
        System.out.println(monster.getName() + ": " + monster.getHealth() + " health vs " + opponent.getName() + ": "
                + opponent.getHealth() + " health");
    }

}
