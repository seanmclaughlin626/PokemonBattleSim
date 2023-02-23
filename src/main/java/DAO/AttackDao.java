package Dao;

import Model.Attack;
import Model.Pokemon;

public interface AttackDao {
    double effectivenessMultiplier(Attack attack, Pokemon targetPokemon);
}
