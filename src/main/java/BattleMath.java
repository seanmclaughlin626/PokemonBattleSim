import Model.Attack;
import Model.Pokemon;
import Dao.JdcbAttackDao;

public class BattleMath {
    public int calculateDamage(Attack attack, Pokemon targetPokemon, double effectivenessMultiplier){
        if (attack.isPhysicalAttack()){
            targetPokemon.takeDamage((int)(attack.getAttackPower() * targetPokemon.getCurrentDefenseStat() * effectivenessMultiplier));
        } else {
            targetPokemon.takeDamage((int)(attack.getAttackPower() * targetPokemon.getCurrentSpDefenseStat() * effectivenessMultiplier));
        }
        return 0;
    }
}
