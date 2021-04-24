public class ConcreteFactory extends AbstractFactory {
    @Override
    public Icnx factoryCnx(TipoCnx cnx) {
        switch (cnx){
            case MYSQL:
                return new CnxMysql();
            case ORACLE:
                return new CnxOracle();
            case MONGO:
                return new CnxMongo();
        }
        return null;
    }
}
