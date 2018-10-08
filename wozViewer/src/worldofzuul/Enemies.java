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
public class Enemies extends Creatures {
    
    Enemies enemy;

    public Enemies(int level, int health, int attack, String lootable, String name, String faction) {
        super(level, health, attack, lootable, name, faction);
    }
    
}
