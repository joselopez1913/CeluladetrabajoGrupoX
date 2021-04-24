public class CnxMongo implements Icnx{
    @Override
    public void crearCnx() {
        System.out.println("Conectando DB..."+TipoCnx.MONGO+"\n");
    }
}
