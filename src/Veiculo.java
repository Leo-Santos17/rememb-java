public class Veiculo {
    String brand;
    String model;
    int year;

    Veiculo(String brand, String model, int year)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    String acelerar()
    {
        return " Acelerando...";
    }

    void mostrarInformacoes()
    {
        System.out.println("----------------------------");
        System.out.println("Marca: "+this.brand);
        System.out.println("Modelo: "+this.model);
        System.out.println("Ano: "+this.year);
        System.out.println(acelerar());
        System.out.println("----------------------------");
    }
}
