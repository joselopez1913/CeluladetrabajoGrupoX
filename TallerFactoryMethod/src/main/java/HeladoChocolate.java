public class HeladoChocolate implements IHelado{

    @Override
    public void hacerHelado() {
        System.out.println("Haciendo helado de... "+TipoHelado.Chocolate+"\n");
    }

    @Override
    public void venderHelado() {
        System.out.println("Vendiendo el helado a 4000");
    }
}
