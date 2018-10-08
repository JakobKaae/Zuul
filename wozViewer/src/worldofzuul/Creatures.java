/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofzuul;

/**
 *
 * @author jakobkaae
 */
public class Creatures {
    //Attributes for all inherited creatures
    private int level;
    private int health;
    private int attack;
    private String lootable;
    private String name;
    private String faction;
    
    public Creatures(int level, int health, int attack, String lootable, String name, String faction) {
        this.level = level;
        this.health = health;
        this.attack = attack;
        this.lootable = lootable;
        this.name = name;
        this.faction = faction;
    }
    
    //Create setters

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setLootable(String lootable) {
        this.lootable = lootable;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }
    

    //Create getters
    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public String getLootable() {
        return lootable;
    }

    public String getName() {
        return name;
    }

    public String getFaction() {
        return faction;
    }
    
    
    
    
}
