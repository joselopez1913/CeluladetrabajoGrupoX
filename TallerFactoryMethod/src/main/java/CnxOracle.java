public class CnxOracle implements Icnx{

    @Override
    public void crearCnx() {
        System.out.println("Conectando DB..."+TipoCnx.ORACLE+"\n");
    }
}
