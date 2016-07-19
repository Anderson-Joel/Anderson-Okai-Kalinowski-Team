/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dragonknight.control;

import byui.cit260.dragonknight.model.Monster;
import byui.cit260.dragonknight.model.Player;
import byui.cit260.dragonknight.exception.LoseGameException;


/**
 *
 * @author andrzejski
 */
public class BattleController {
    
    
    public static boolean meleeMonster(Monster m) {
        
        int playerInflictDamageMelee = (int) (Monster.MAX__MONSTER_DAMAGE * Math.random() / 2) + 1;
       // int monsterInflictDamage = (int) (Monster.MAX__MONSTER_DAMAGE * Math.random() / 2) + 1;
        
        
        
        m.setHitPoint(m.getHitPoint() - playerInflictDamageMelee);

        // maybe write some confirmation text that in fact you have chosen to melee with the monster
        System.out.println("You have chosen to Melee with the monster");
        System.out.println("Monster sustained " + playerInflictDamageMelee + " Damage.");
        System.out.println("Monster has " + m.getHitPoint() + " HP");
        
        if (m.getHitPoint() >= 0) {
            return true;
            // The Monster is still alive        
        } else {
            return false;
            //you beat the monster
            
        }
        

    }
    
    public static boolean defendMonster(Player p, Monster m) {
        
        //int monsterInflictDamage = (int) (Monster.MAX__MONSTER_DAMAGE * Math.random() / 5) + 1;
        int playerInflictDamageLow = (int) (Player.MAX_DAMAGE * Math.random() / 4) + 1;
        
       // p.setHitPoint(p.getHitPoint() - monsterInflictDamage);
        m.setHitPoint(m.getHitPoint() - playerInflictDamageLow);
        
        System.out.println("You have chosen to Melee with the monster");
        System.out.println("Monster sustained " + playerInflictDamageLow + " Damage.");
        System.out.println("Monster has " + m.getHitPoint() + " HP");
        
        
        if (m.getHitPoint() >= 0) {
            return true;
            // The Monster is still alive        
        } else {
            return false;
            //you beat the monster
            
        }
        
        
        

        
    }
    
    
    public static boolean useMagic(Player p, Monster m) throws LoseGameException {
       
        int monsterInflictDamage = (int) (Monster.MAX__MONSTER_DAMAGE * Math.random() / 5) + 1;
        int playerInflictDamage = (int) (Player.MAX_DAMAGE * Math.random() / 4) + 1;
        
        p.setHitPoint(p.getHitPoint() - monsterInflictDamage);
        m.setHitPoint(m.getHitPoint() - playerInflictDamage);
        
        System.out.println("You have " + p.getHitPoint() + " HP");
        System.out.println("Monster has " + m.getHitPoint() + " HP");
        
        
        if(p.getHitPoint() > 0){
            if(m.getHitPoint() <= 0) {
                System.out.println("Monster Died");
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("You Died");
            throw new LoseGameException();
        }            
        
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
