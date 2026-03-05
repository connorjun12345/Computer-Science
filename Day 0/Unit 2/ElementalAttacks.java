public interface ElementalAttacks {

    // to-do: Implement the attack method for ElementalAttacks
    // Every monster has 2 different attacks, each with different damage and type.
    // There is a 45% chance the monster should use AttackOne
    // There is a 45% chance the monster should use AttackTwo
    // There is a 10% chance the monster doubles down and uses BOTH attacks with
    // doubleDown Attack
    // - The double down attack is only available once per battle.
    // - After using double down, the attack probability is 50% / 50% for Attacks
    // 1/2
    default void attack(Monster opponent) {
        double number = Math.random();
        if (player.hasUsedDoubleDown()) {
            if (number < 0.5) {
                performSingleElementalAttack(1, opponent);
            } else {
                performSingleElementalAttack(2, opponent);
            }
            return;
        }
        if (number < 0.45) {
            performSingleElementalAttack(1, opponent);
        } else if (number < 0.90) {
            performSingleElementalAttack(2, opponent);
        } else {
            performDoubleDownAttack(opponent);
        }
        // implement this method here
    }

    // to-do: Implement the attack method for performSingleElementalAttack
    // The current moster attacks the opponent using the attackNumber provided
    default void performSingleElementalAttack(int attackNumber, Monster opponent) {
        String attackName = attackNumber1
        if (attackNumber == 1){
            String attackName = attackNumber1
        } 
        else if (attackNumber == 2) {
            attackName = attackNumber2
        }

        ElementType attackType = attackNumber1;
        if (attackNumber == 1 ) {
            ElementType attackType = attackNumber1
        } else if (attackNumber == 2 ) {
            ElementType attackType = attackNumber2
        }

        System.out.println(player.getName() + " used " + attackName + "!")

        if (effectiveness == 2.0) {
            System.out.println("It was super effective!");
        } else if (effectiveness ==0.5) {
            System.out.println("It was not very effective!")
        }

        double stab = 1.0;
        if (player.getElement() == attackType) {
            stab = 1.5;
        }

        double damage = 10.0 * ((double) player.getAttack() / (double) opponent.getDefense() * stab * effectiveness)
        if (didAttackCrit(attackNumber)) {

        }
        
            
        String attackName = attackNumber
        // implement this method here
    }

    // to-do: Implement the useDoubleDown() method for the monster
    // This method is called when the monster uses their double down attack.
    // The double down attack is only available once per battle
    // If the monster has already used their double down attack, print a message
    // saying so and
    // return. The
    // monster effectively loses their turn.
    default void performDoubleDownAttack(Monster opponent) {
        Monster player = this.monster;

        if (player.hasUsedDoubleDown) {
            System.out.println(player.getName() + " used Double Down!");
            player.useDoubleDown();
        }
        // implement this here
    }

    // to-do: didAttackCrit
    // returns a boolean if an attack critically struck based on the speed of the
    // attacking monster
    public static boolean didAttackCrit(int speed) {
        if (speed < 0) {
            throw new IllegalArgumentException("Speed must be greater than 0");
        }

        double chance = (double) speed / 250.0;
        if (Math.random() < chance) {
            return true;
        } else {
            return false;
        }
        // doesnt actually always return false. please implement!
    }

    /**
     * Returns true if attackType is super effective against defenderType.
     * Fire->Air, Air->Earth, Earth->Water, Water->Fire
     */
    static boolean isSuperEffectiveAgainst(ElementType attackType, ElementType defenderType) {
        if (attackType == null || defenderType == null)
            return false;
        return (attackType == ElementType.FIRE && defenderType == ElementType.AIR)
                || (attackType == ElementType.AIR && defenderType == ElementType.EARTH)
                || (attackType == ElementType.EARTH && defenderType == ElementType.WATER)
                || (attackType == ElementType.WATER && defenderType == ElementType.FIRE);
    }

    /**
     * Returns the effectiveness multiplier: 2.0 (super), 1.0 (normal), or 0.5
     * (low).
     */
    static double getElementalMultiplier(ElementType attackType, ElementType defenderType) {
        if (attackType == null || defenderType == null)
            return 1.0;
        if (isSuperEffectiveAgainst(attackType, defenderType))
            return 2.0;
        if ((attackType == ElementType.FIRE && (defenderType == ElementType.WATER || defenderType == ElementType.FIRE))
                || (attackType == ElementType.WATER
                        && (defenderType == ElementType.EARTH || defenderType == ElementType.WATER))
                || (attackType == ElementType.EARTH
                        && (defenderType == ElementType.AIR || defenderType == ElementType.EARTH))
                || (attackType == ElementType.AIR
                        && (defenderType == ElementType.FIRE || defenderType == ElementType.AIR)))
            return 0.5;
        return 1.0;
    }
}
