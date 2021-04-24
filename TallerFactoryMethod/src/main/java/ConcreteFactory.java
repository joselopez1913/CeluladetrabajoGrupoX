public class ConcreteFactory extends AbstractFactory{

    @Override
    public IHelado factoryHelado(TipoHelado helado) {
        switch (helado){
            case Fresa:
                return new HeladoFresa();
            case Vainilla:
                return new HeladoVainilla();
            case Chocolate:
                return new HeladoChocolate();
        }
        return null;
    }
}
