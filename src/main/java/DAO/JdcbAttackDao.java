package Dao;

import javax.sql.DataSource;
import Model.Attack;
import Model.Pokemon;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.List;

public class JdcbAttackDao implements AttackDao {

//    jdbcTemplate instance variable
    private final JdbcTemplate jdbcTemplate;

//    dao constructor
    public JdcbAttackDao(DataSource dataSource) {this.jdbcTemplate = new JdbcTemplate(dataSource);}

//    damage multiplier method
    @Override
    public double effectivenessMultiplier(Attack attack, Pokemon targetPokemon){
        double multiplier = 1;
        List<String> targetPokemonTypes = targetPokemon.getTypes();
        String attackType = attack.getType();
        for(String targetType : targetPokemonTypes){
            String sql = "SELECT ? FROM type_effectiveness_chart WHERE base_type = ?;";
            SqlRowSet result = jdbcTemplate.queryForRowSet(sql, targetType.toLowerCase(), attackType.toLowerCase());
            multiplier *= result.getDouble(targetType.toLowerCase());
        }
        return multiplier;
    }
}
