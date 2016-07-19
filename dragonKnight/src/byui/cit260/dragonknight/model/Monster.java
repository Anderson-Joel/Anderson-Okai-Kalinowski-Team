package byui.cit260.dragonknight.model;

import byui.cit260.dragonknight.control.BattleController;
import byui.cit260.dragonknight.exception.BattleControllerException;
import java.io.Serializable;
import java.util.Objects;
import java.util.Random;
/**
 *
 * @author gee
 */
public class Monster implements Serializable { 
    
    public static final int MAX__MONSTER_DAMAGE = 9;

    
    private String name;
    private String description;
    private double hitPoint;
    private String itemDrop;
    private int health;
    private int defense;
    private int minAttackDamage;
    private int maxAttackDamage;
    private int abilityDamage;
    private final static Random random = new Random();
    private final static int NUM_MONSTERS = 8;
    
    private Game game;
    private Location[] location;
    

    public Monster() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(double hitPoint) {
        this.hitPoint = hitPoint;
    }

    public String getItemDrop() {
        return itemDrop;
    }

    public void setItemDrop(String itemDrop) {
        this.itemDrop = itemDrop;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }
    
    public Monster(String monsterName, int health, int defense, int minAttackDamage, int maxAttackDamage, int abilityDamage) {
        
        this.health = health;
        this.defense = defense;
        this.minAttackDamage = minAttackDamage;
        this.maxAttackDamage = maxAttackDamage;
        this.abilityDamage = abilityDamage;
}
    public static Monster newRandomInstance() {
    if (Monster.size() == NUM_MONSTERS) {
            Monster.clear();
        }
        int i;
        do {
            i = random.nextInt(NUM_MONSTERS);
        } while (Monster.contains(i));
        Monster.add(i);
        switch (i) {
            case 0:
                return new Monster("Dragon Lord",45,10,10,20,25);
            case 1:
                return new Monster("Fire Storm",10,1,1,3,1);
            case 2:
                return new Monster("Giant Dragon",5,3,1,5,1);
            case 3:
                return new Monster("Creepy Dragon",45,7,5,10,15);
            case 4:
                return new Monster("Cave Fisher",40,6,1,8,1);
            case 5:
                return new Monster("Giant Heads Dragon",20,5,1,3,5);
            case 6:
                return new Monster("Panky",15,10,1,3,1);
            case 7:
                return new Monster("Death Knight",80,15,15,25,50);
            case 8:
                return new Monster("Zee Dargon",35,4,2,10,10);
            default:
                return new Monster("Bloody Dragon",45,4,2,10,10);
        }
}

public static Monster newBossInstance() {
        return new Monster("Dragon",120,20,25,35,25);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
    
    public int getMinAttackDamage() {
        return minAttackDamage;
    }

    public void setMinAttackDamage(int minAttackDamage) {
        this.minAttackDamage = minAttackDamage;
    }

    public int getMaxAttackDamage() {
        return maxAttackDamage;
    }

    public void setMaxAttackDamage(int maxAttackDamage) {
        this.maxAttackDamage = maxAttackDamage;
    }

    public int getAbilityDamage() {
        return abilityDamage;
    }

    public void setAbilityDamage(int abilityDamage) {
        this.abilityDamage = abilityDamage;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.hitPoint) ^ (Double.doubleToLongBits(this.hitPoint) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.itemDrop);
        hash = 71 * hash + this.health;
        hash = 71 * hash + this.defense;
        hash = 71 * hash + this.minAttackDamage;
        hash = 71 * hash + this.maxAttackDamage;
        hash = 71 * hash + this.abilityDamage;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Monster other = (Monster) obj;
        if (Double.doubleToLongBits(this.hitPoint) != Double.doubleToLongBits(other.hitPoint)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return Objects.equals(this.itemDrop, other.itemDrop);
    }

    @Override
    public String toString() {
        return "Monster{" + "name=" + name + ", description=" + description + ", hitPoint=" + hitPoint + ", itemDrop=" + itemDrop + '}';
    }

    public String getMonsterName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public int attack() throws BattleControllerException {
        return BattleControlller.random(minAttackDamage, maxAttackDamage);
    }
    public boolean isAlive() {
        return health > 0;
    }
    
    public String getStatus() {
        return "Monster HP: " + health;
    }

    private static class BattleControlller {

        private static int random(int minAttackDamage, int maxAttackDamage) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        private int health;
        private int defense;
        private int minAttackDamage;
        private int maxAttackDamage;
        private int abilityDamage;

        public BattleControlller() {
        }
         @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Monster other = (Monster) obj;
        if (this.health != other.health) {
            return false;
        }
        if (this.defense != other.defense) {
            return false;
        }
        if (this.minAttackDamage != other.minAttackDamage) {
            return false;
        }
        if (this.maxAttackDamage != other.maxAttackDamage) {
            return false;
        }
        if (this.abilityDamage != other.abilityDamage) {
            return false;
        }
        
        return true;
    }
    
//    public int attack() throws BattleControllerException {
//        return BattleController.random (minAttackDamage, maxAttackDamage);
//    }
    public boolean isAlive() {
        return health > 0;
    }
    
    public String getStatus() {
        return "Monster HP: " + health;
    }

          }
    private static int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static boolean contains(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void add(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
