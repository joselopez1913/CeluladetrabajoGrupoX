public class CnxMysql implements Icnx {
    @Override
    public void crearCnx() {
        System.out.println("Conectando DB..."+TipoCnx.MYSQL+"\n");
    }
}
