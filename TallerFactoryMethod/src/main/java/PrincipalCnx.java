import java.util.Random;

public class PrincipalCnx {
    public static void main(String[] args) throws InterruptedException {
        Icnx cnx = null;
        ConcreteFactory concreteFactory = new ConcreteFactory();
        Random random = new Random();
        Integer var = null;

        for (; ; ) {
            var = random.nextInt(4);
            Thread.sleep(8000);

            if (var==0) {
                System.out.println("Usuario registrado en DB mysql");
                cnx = concreteFactory.factoryCnx(TipoCnx.MYSQL);

            }if (var==1) {
                System.out.println("Usuario registrado en DB Oracle");
                cnx = concreteFactory.factoryCnx(TipoCnx.ORACLE);

            }if (var==2) {
                System.out.println("Usuario registrado en MongoDB");
                cnx = concreteFactory.factoryCnx(TipoCnx.MONGO);


            } if(var==3) {
                System.out.println("\n");
                System.out.println("-----------------------------");
                System.out.println("------ Ópcion Invalida ------");
                System.out.println("-----------------------------\n");
            }
            cnx.crearCnx();
        }
    }
}
