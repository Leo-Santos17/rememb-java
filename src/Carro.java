public class Carro extends Veiculo
{
    int numeroDePortas;

    Carro(String brand, String model, int year, int numeroDePortas)
    {
        super(brand, model, year);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    String acelerar() {
        return "Carro acelerando...";
    }
}
