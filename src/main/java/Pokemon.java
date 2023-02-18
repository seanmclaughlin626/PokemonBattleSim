import Types.Type;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private int maxHealth;
    private int currentHealth = maxHealth;
    private List<Type> types = new ArrayList<Type>();
    private int defaultAttackStat;
    private int defaultDefenseStat;
    private int defaultSpAttackStat;
    private int defaultSpDefenseStat;
    private int currentAttackStat = defaultAttackStat;
    private int currentDefenseStat = defaultDefenseStat;
    private int currentSpAttackStat = defaultSpAttackStat;
    private int currentSpDefenseStat = defaultSpDefenseStat;

    public Pokemon(int maxHealth, List<Type> types, int defaultAttackStat, int defaultDefenseStat, int defaultSpAttackStat, int defaultSpDefenseStat) {
        this.maxHealth = maxHealth;
        this.types = types;
        this.defaultAttackStat = defaultAttackStat;
        this.defaultDefenseStat = defaultDefenseStat;
        this.defaultSpAttackStat = defaultSpAttackStat;
        this.defaultSpDefenseStat = defaultSpDefenseStat;
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
