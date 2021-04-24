public class HeladoVainilla implements IHelado{
    @Override
    public void hacerHelado() {
        System.out.println("Haciendo helado de... "+TipoHelado.Vainilla+"\n");
    }

    @Override
    public void venderHelado() {
        System.out.println("Vendiendo el helado a 5000");
    }
}
