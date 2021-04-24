import java.util.Random;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        IHelado helado = null;
        ConcreteFactory concreteFactory = new ConcreteFactory();
        Random random = new Random();
        Integer var = 0;

        for (; ; ) {
            var = random.nextInt(4);
            Thread.sleep(8000);
            switch (var) {
                case 0:
                    helado = concreteFactory.factoryHelado(TipoHelado.Chocolate);
                    break;
                case 1:
                    helado = concreteFactory.factoryHelado(TipoHelado.Fresa);
                    break;
                case 2:
                    helado = concreteFactory.factoryHelado(TipoHelado.Vainilla);
                    break;
                default:
                    System.out.println("\nNo Solicitó ningún helado");
                    break;


            }
            helado.hacerHelado();
            helado.venderHelado();
        }
    }
}
