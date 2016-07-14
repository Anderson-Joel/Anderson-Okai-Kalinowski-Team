/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dragonknight.control;

import byui.cit260.dragonknight.model.Monster;
import byui.cit260.dragonknight.model.Player;

/**
 *
 * @author andrzejski
 */
public class BattleController {
    
    
    public boolean meleeMonster(Player p, Monster m) {
        
        int playerInflictDamage = (int) (p.getHitPoint() * Math.random()/2) + 1;
        
        
        
    return true;    
    }
}
