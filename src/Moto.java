public class Moto extends Veiculo
{
    boolean temPartidaEletrica;

    Moto(String brand, String model, int year, boolean temPartidaEletrica)
    {
        super(brand, model, year);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    @Override
    String acelerar() {
        return "Moto acelerando...";
    }
}
