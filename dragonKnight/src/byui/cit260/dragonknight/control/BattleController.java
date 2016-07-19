/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dragonknight.control;

import byui.cit260.dragonknight.model.Monster;
import byui.cit260.dragonknight.model.Player;
import byui.cit260.dragonknight.exception.LoseGameException;
import byui.cit260.dragonknight.view.BattleView;

/**
 *
 * @author andrzejski
 */
public class BattleController {

    public static boolean meleeMonster(Player p, Monster m) {

        int playerInflictDamageMelee = (int) (Monster.MAX__MONSTER_DAMAGE * Math.random() / 2) + 1;
        int monsterInflictDamageMelee = (int) (Monster.MAX__MONSTER_DAMAGE * Math.random() / 2) + 1;

        m.setHitPoint(m.getHitPoint() - playerInflictDamageMelee);
        p.setHitPoint(p.getHitPoint() - monsterInflictDamageMelee);
       
        System.out.println("You have chosen to Melee with the monster");
        System.out.println("Monster sustained " + playerInflictDamageMelee + " Damage.");
        System.out.println("Monster now has " + m.getHitPoint() + " HP");
        
        System.out.println("You sustained " + monsterInflictDamageMelee + " Damage.");
        System.out.println("You now have " + p.getHitPoint() + " HP");     



        if (p.getHitPoint() >= 0) {
            if (m.getHitPoint() >= 0) {
                BattleView bv = new BattleView();
                bv.display();
            } else
                return true;
        } else {
            // Throw lose game excpetion here- watch the exceptions video -- must try + catch.
            //throw new LoseGameException("YOU LOSE, LOSER");
        }
        
        //this probably shouldn't be here, just using for functionality's sake
        return true;
    }

    public static boolean defendMonster(Player p, Monster m) {

        int playerInflictDamageMelee = (int) (Monster.MAX__MONSTER_DAMAGE * Math.random() / 2) + 1;
        int monsterInflictDamageMelee = (int) (Monster.MAX__MONSTER_DAMAGE * Math.random() / 2) + 1;

        m.setHitPoint(m.getHitPoint() - playerInflictDamageMelee);
        p.setHitPoint(p.getHitPoint() - monsterInflictDamageMelee);
       
        System.out.println("You have chosen to Melee with the monster");
        System.out.println("Monster sustained " + playerInflictDamageMelee + " Damage.");
        System.out.println("Monster now has " + m.getHitPoint() + " HP");
        
        System.out.println("You sustained " + monsterInflictDamageMelee + " Damage.");
        System.out.println("You now have " + p.getHitPoint() + " HP");     


        if (p.getHitPoint() >= 0) {
            if (m.getHitPoint() >= 0) {
                BattleView bv = new BattleView();
                bv.display();
            } else
                return false;
        } else {
            // Throw lose game excpetion here- watch the exceptions video
        
        }
        
        //this probably shouldn't be here, just using for functionality's sake
        return true;

    }

    public static boolean useMagic(Player p, Monster m) {

        int playerInflictDamageMelee = (int) (Monster.MAX__MONSTER_DAMAGE * Math.random() / 2) + 1;
        int monsterInflictDamageMelee = (int) (Monster.MAX__MONSTER_DAMAGE * Math.random() / 2) + 1;

        m.setHitPoint(m.getHitPoint() - playerInflictDamageMelee);
        p.setHitPoint(p.getHitPoint() - monsterInflictDamageMelee);
       
        System.out.println("You have chosen to Melee with the monster");
        System.out.println("Monster sustained " + playerInflictDamageMelee + " Damage.");
        System.out.println("Monster now has " + m.getHitPoint() + " HP");
        
        System.out.println("You sustained " + monsterInflictDamageMelee + " Damage.");
        System.out.println("You now have " + p.getHitPoint() + " HP");     



        if (p.getHitPoint() >= 0) {
            if (m.getHitPoint() >= 0) {
                BattleView bv = new BattleView();
                bv.display();
            } else
                return false;
        } else {
            // Throw lose game excpetion here- watch the exceptions video
        
        }
        
        //this probably shouldn't be here, just using for functionality's sake
        return true;
    }

    public static boolean runAway(Player p, Monster m) {

        int chanceOfRunningAway = (int) (Player.MAX_DAMAGE * Math.random() * 5) + 1;

        if (chanceOfRunningAway < 50) {
            System.out.println("Got Away Safely");
            return true;
        } else {
            System.out.println("Didn't get away");
            return false;
        }
    }

    public static int random(int minAttackDamage, int maxAttackDamage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
