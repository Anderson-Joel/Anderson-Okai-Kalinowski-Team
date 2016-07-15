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
    
    
    public static boolean meleeMonster(Player p, Monster m) throws LoseGameException {
        
        int playerInflictDamage = (int) (Player.MAX_DAMAGE * Math.random() / 2) + 1;
        int monsterInflictDamage = (int) (Monster.MAX__MONSTER_DAMAGE * Math.random() / 2) + 1;
        
        
        
        m.setHitPoint(m.getHitPoint() - playerInflictDamage);
        p.setHitPoint(p.getHitPoint() - monsterInflictDamage);
        
        // maybe write some confirmation text that in fact you have chosen to melee with the monster
        
        if(p.getHitPoint() > 0){
            if(m.getHitPoint() <= 0) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("You Died");
            throw new LoseGameException();
        }  
            
        
        
    //    if(m.getHitPoint() <= 0) {
    //        return true;
    //    } else {
    //        return false;
    //    }
    
    }
    
    public static boolean defendMonster(Player p, Monster m) throws LoseGameException {
        
        int monsterInflictDamage = (int) (Monster.MAX__MONSTER_DAMAGE * Math.random() / 5) + 1;
        int playerInflictDamage = (int) (Player.MAX_DAMAGE * Math.random() / 4) + 1;
        
        p.setHitPoint(p.getHitPoint() - monsterInflictDamage);
        m.setHitPoint(m.getHitPoint() - playerInflictDamage);
        
        
        if(p.getHitPoint() > 0){
            if(m.getHitPoint() <= 0) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("You Died");
            throw new LoseGameException();
        }          
        
        
        
        
    //    if(m.getHitPoint() <= 0) {
    //        return true;
    //    } else {
    //        return false;
    //    } 
        
    }
    
    
    public static boolean useMagic(Player p, Monster m) throws LoseGameException {
       
        int monsterInflictDamage = (int) (Monster.MAX__MONSTER_DAMAGE * Math.random() / 5) + 1;
        int playerInflictDamage = (int) (Player.MAX_DAMAGE * Math.random() / 4) + 1;
        
        p.setHitPoint(p.getHitPoint() - monsterInflictDamage);
        m.setHitPoint(m.getHitPoint() - playerInflictDamage);
        
        
        if(p.getHitPoint() > 0){
            if(m.getHitPoint() <= 0) {
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
            return true;
        } else {
            return false;
        }
    }
}
