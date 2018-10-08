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
public class Orc extends Enemies {
    int extraHealth;
    int extraAttack;

    public Orc(int level, int health, int attack, String lootable, String name, String faction) {
        super(level, health, attack, lootable, name, faction);
        this.extraHealth = 10;
        this.extraAttack = 12;
        
        
        
    }
    
}
