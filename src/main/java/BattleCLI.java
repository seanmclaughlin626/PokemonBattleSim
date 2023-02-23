import Dao.AttackDao;
import Dao.JdcbAttackDao;
import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;

public class BattleCLI {
    private final AttackDao attackDao;

    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/PokemonBattleSim");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");
    }

    public BattleCLI(DataSource datasource){
        attackDao = new JdcbAttackDao(datasource);
    }
}
