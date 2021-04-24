public class HeladoFresa implements IHelado{
    @Override
    public void hacerHelado() {
        System.out.println("Haciendo helado de... "+TipoHelado.Fresa+"\n");;
    }

    @Override
    public void venderHelado() {
        System.out.println("Vendiendo el helado a 3000");
    }


}
