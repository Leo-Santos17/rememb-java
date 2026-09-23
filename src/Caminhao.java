public class Caminhao extends Veiculo
{

    double capacidadeCarga;

    Caminhao(String brand, String model, int year, double carga)
    {
        super(brand, model, year);
        this.capacidadeCarga = carga;
    }

    @Override
    String acelerar() {
        return "Caminhão acelerando...";
    }
}
