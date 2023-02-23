package Model;

import Types.Type;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private String name;
    private int maxHealth;
    private int currentHealth = maxHealth;
    private List<String> types = new ArrayList<>();
    private int defaultAttackStat;
    private int defaultDefenseStat;
    private int defaultSpAttackStat;
    private int defaultSpDefenseStat;
    private int currentAttackStat = defaultAttackStat;
    private int currentDefenseStat = defaultDefenseStat;
    private int currentSpAttackStat = defaultSpAttackStat;
    private int currentSpDefenseStat = defaultSpDefenseStat;

//  Constructor
    public Pokemon(int maxHealth, List<String> types, int defaultAttackStat, int defaultDefenseStat, int defaultSpAttackStat, int defaultSpDefenseStat) {
        this.maxHealth = maxHealth;
        this.types = types;
        this.defaultAttackStat = defaultAttackStat;
        this.defaultDefenseStat = defaultDefenseStat;
        this.defaultSpAttackStat = defaultSpAttackStat;
        this.defaultSpDefenseStat = defaultSpDefenseStat;
    }

//    Getters/setters


    public String getName() {
        return name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public List<String> getTypes() {
        return types;
    }

    public int getDefaultAttackStat() {
        return defaultAttackStat;
    }

    public int getDefaultDefenseStat() {
        return defaultDefenseStat;
    }

    public int getDefaultSpAttackStat() {
        return defaultSpAttackStat;
    }

    public int getDefaultSpDefenseStat() {
        return defaultSpDefenseStat;
    }

    public int getCurrentAttackStat() {
        return currentAttackStat;
    }

    public int getCurrentDefenseStat() {
        return currentDefenseStat;
    }

    public int getCurrentSpAttackStat() {
        return currentSpAttackStat;
    }

    public int getCurrentSpDefenseStat() {
        return currentSpDefenseStat;
    }

    //    Stat changes
//    ----Stat decreases
    public int decreaseAttack(int decreaseBy){
        return this.currentAttackStat -= decreaseBy;
    }
    public int decreaseSpAttack(int decreaseBy){
        return this.currentSpAttackStat -= decreaseBy;
    }
    public int decreaseDefense(int decreaseBy){
        return this.currentDefenseStat -= decreaseBy;
    }
    public int decreaseSpDefense(int decreaseBy){
        return this.currentSpDefenseStat -= decreaseBy;
    }
//   ----Stat boosts
    public int boostAttack(int boostBy){
        return this.currentAttackStat += boostBy;
    }
    public int boostSpAttack(int boostBy){
        return this.currentSpAttackStat += boostBy;
    }
    public int boostDefense(int boostBy){
        return this.currentDefenseStat += boostBy;
    }
    public int boostSpDefense(int boostBy){
        return this.currentSpDefenseStat += boostBy;
    }
//  ----Restore all stats
    public void restoreStats(){
        this.currentAttackStat = this.defaultAttackStat;
        this.currentDefenseStat = this.defaultDefenseStat;
        this.currentSpAttackStat = this.defaultSpAttackStat;
        this.currentSpDefenseStat = this.defaultSpDefenseStat;
    }
//  Damage and healing
    public int takeDamage(int damage){
        return this.currentHealth -= damage;
    }
    public int heal(int damageHealed){
        if(this.currentHealth + damageHealed > this.maxHealth){
            return this.currentHealth = this.maxHealth;
        } else {
            return this.currentHealth += damageHealed;
        }
    }
}
