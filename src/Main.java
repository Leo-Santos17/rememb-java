public class Main {
    public static void main(String[] args){
        Veiculo[] garagem = {
                new Moto("Honda", "Sahada", 2020, true),
                new Carro("Toyota", "Corolla", 2018, 4),
                new Caminhao("Volks", "Hyu", 2012, 1000),
                new Carro("Honda", "Civic", 2025, 2),
                new Moto("Suzuku", "SAX", 2011, false)
        };

        for(Veiculo veiculo: garagem)
        {
            veiculo.mostrarInformacoes();
        }
    }
}